package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static Test.Person.persons;
import static java.util.Arrays.spliterator;
import static java.util.Arrays.stream;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString.toArray;

public class ControlTest {


    @Test
    public void test1a() throws IOException {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1", "b1");
        // Проверить первый элемент коллекции,
        String first = "";
        // последний элемент коллекции,
        String last = "";
        // число элементов,
        long count = Collection.stream().count;
        // проверить, существует ли элемент
        String find = Collection.stream().filter("a3"::equals)
                findFirst.get
        //Выбрать элемент по шаблону regex, чтобы строка начиналась на 'b'
        List<String>selected = collection.stream().filter(s-> Pattern.compile("").matcher(s.matches().collect(collectors.toList)));
        Assertions.assertAll("",
                ()-> Assertions.assertEquals(first, "a1"),
                ()-> Assertions.assertEquals(first,"b1")
        );

    }


    @Test
    public void test1b() throws IOException {
        // Выбрать мужчин от 20 до 30 лет
        List<Person> mans =
                persons.stream
                        ().filter(p->p.getAge()>=20&&p.getAge()<=30&&p.getSex()==
                        Person.Sex.MAN
                ).collect(Collectors.toList());
        // Найти средний возраст среди мужчин
      //  Double meanAge = Person.persons.stream().filter(i->i.getAge()).
      //  .average().getAsDouble()
        // Найти количество трудоспособных (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        long count = Person.persons.stream().filter(i->p.getAge>=18).filter(p->(i.getSex==p.getSex().WOMAN&&i.getAge<55)||i.getSex==p.getSex().MAN && i.getAge<60).count();
        // Найти человека с максимальным возрастом
        PersonOlder == Person.persons.stream().max(p1,p2)->p1.getAge.compareTo(p2.geAge)).get);
        // Отсортировать по имени в обратном алфавитном порядке
        List<Person>byName = Person.persons.stream().sorted(p1,p2)->-p1

        // Отсортировать сначала по полу, а потом по возрасту
        List<Person> sorted2 = Person.persons.stream()
                .sorted((p1,p2)->p1.getSex()!=p2.getSex()?p1.getSex().
                        compareTo(p2.getSex()):p1.getAge().compareTo(p2.getAge()))
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(sorted2.toArray()));
        //Группировка по полу
        Map<Person.Sex, List<Person>> group = Person.persons.stream()
                .collect(Collectors.groupingBy(Person::getSex));
        System.out.println(group.toString());
    }

    @Test
    public void test2() {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Получить все числа подряд, записать в массив целых чисел
        int[] numbers = collection.stream()
                .mapToInt(s->Integer.parseInt(s.substring(1)))
                .toArray();

        // Получить все числа подряд, записать в массив строк
        collection = Arrays.asList("1,2,0", "4,5");
        String[] strings = collection.stream()
                .flatMap(s->Arrays.asList(s.split(","))).stream())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
        //Найти сумму всех чисел, которые хранятся через запятую в collection
        collection = Array.asList("1,2,0", "4,5", "1,2");
        int sum = collection.stream()
                .flatMapToInt(s->Arrays.asList(s,spliterator(","). stream()
                        .mapToInt(Integer::parceInt)))
                .sum();
        System.out.println(sum);

    }
    @Test
    public void test1() throws IOException {
        //Используя stream, записать в файл последовательность строк "a1,b2,c3,d4...z26"
        File file = new File("src/test/data.txt");
        PrintWriter out = new PrintWriter(file);
        IntStream.rangeClosed(1,26)
                .mapToObj(i->new StringBuilder()
                        .append(Character.toString(i+'a'-1))
                                .append(Integer.toString(i)).toString())
                .forEach(out::println);
        out.close();
        //Прочитать данные из файла. Проверить первую и последнюю записанные строки
        List <String> strings = Files.lines(Paths.get("src/test/data.txt"))
                .collect(Collectors.toList());//дает строки из файла

        Assertions.assertAll("executable instance check",
                () -> Assertions.assertEquals(strings.get(0), "a1"),
                () -> Assertions.assertEquals(strings.get(strings.size() - 1), "z26")
        );

    }

}