package TelephoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelephoneNumbers {
//    Имеется телефонная книга со списком номеров.
//    Вывести в отсортированном по фамилии порядку номера,
//    начинающиеся на определенную цифру.
public static void main(String[] args) {
    List<Number> numbers = new ArrayList<>();
    numbers.add(new Number("Ivanov", "352525"));
    numbers.add(new Number("Petrov", "363636"));
    numbers.add(new Number("Sidorov", "454545"));

    //Collections.sort(numbers);
    for(Number number: numbers)
        System.out.println(number.toString());
    Number number1 = new Number("Ivanov", "352525");
    Number number2 = new Number("Petrov", "363636");
    Number number3 = new Number("Sidorov", "454545");






}
}
 class Number{
    private String surname;
    private String number1;

    public Number(String Surname, String number) {
        this.surname = surname;
        this.number1 = number1;
    }


     public String getSurname() {
         return surname;
     }


     public String getNumber() {
         return number1;
     }


     @Override
     public String toString() {
         return "Number{" +
                 "Surname='" + surname + '\'' +
                 ", Number='" + number1 + '\'' +
                 '}';
     }


 }

