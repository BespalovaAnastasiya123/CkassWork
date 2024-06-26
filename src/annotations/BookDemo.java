package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class BookDemo{
    public static void main(String[] args) {
        Book book = new Book(null, "author",2010,10);

        BookProcessor bookProcessor = new BookProcessor(book);
        bookProcessor.print();

    }
}
@BookAnnotation("long")
class Book{

    @NonNull
    public String title;
    @NonNull
    public String author;
    public int year;
   // @IntPositive//

    public int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;

        this.author
                = author;
        this.year = year;
        this.pages = pages;
    }

    public void printShort(){
        System.out.println("Title: "+title+", author:"+author);
    }

    public void printLong(){
        System.out.println("Title: "+title+", author:"+author+ ", year"+year);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface BookAnnotation{
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)

    public String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NonNull{}



class BookProcessor {
    private Book book;

    public BookProcessor(Book book) {

        this.book
                = book;
    }

    public void print() {
        //Java reflection
        Class clazz = Book.class;
        //Получить инфо об аннотации
        Annotation bookAnnotation = clazz.getAnnotation(BookAnnotation.class);

//System.out.println (bookAnnotation);
        if (bookAnnotation instanceof BookAnnotation) {
            if (((BookAnnotation) bookAnnotation).value().equals("short"))
                book.printShort();
            if (((BookAnnotation) bookAnnotation).value().equals("long"))
                book.printLong();
        }

        Annotation[] annotations = clazz.getAnnotations();
    }

    public void checkFieldsNonNull() {
        Field[] fields = book.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(NonNull.class);
            try {
                if ((annotation != null) && field.get(book) == null)
                    System.err.println("Field " + field.getName() + " cannot be null");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
}
