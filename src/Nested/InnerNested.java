package Nested;/*В Java существуют 4 типа вложенных (nested) классов:
Статические вложенные классы
Внутренние классы
Локальные классы
Анонимные (безымянные) классы*/

public class InnerNested {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.addAccount("password");
        Math2.Factorial factorial = Math2.getFactorial(5);//Основной класс.статический вложенный класс  объект = метод
        System.out.println(factorial.getResult());//вызываем отдельный метод


    }
}
//вложенный класс в методе основного класса
class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public void addAccount(String password) {
        class Account {
            void display() {
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}
//Статический вложенный класс
class Math2{

    public static class Factorial{

        private int result;
        private int key;

        public Factorial(int result, int key){
            this.result=result;
            this.key = key;
        }

        public int getResult(){
            return result;
        }

        public int getKey(){
            return key;
        }
    }

    public static Factorial getFactorial(int key){
        int result=1;
        for (int i = 1; i <= key; i++)
            result *= i;
        return new Factorial(result, key);
    }
}