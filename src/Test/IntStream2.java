package Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStream2 {
    public static void main(String[] args) {
        //вывести первые n чисeл Фибоначчи
        int[] fib = Stream.iterate(new int[]{0,1}, t->new int[]{t[1], t[0]+t[1]})
                .limit(10)
                .mapToInt(t->t[0])
                .toArray();
                System.out.println(Arrays.toString(fib));
           //Сумма четных чисел Фибоначчи не превышающих  count
        int[] sum = Stream.iterate(new int[] {0,1}, t->new int[]{t[1], t[0]+t[1]})
                .filter(t->t[0]%2==0)

    }
    class Pair {
        final int num;
        final int value;

        Pair(int num, int value) {
            this.num = num;
            this.value = value;
        }
    }
    //Максимальный палиндром, полученный при произведении двух двузначных чисел
    long pal =  IntStream.iterate(10000, n->n-1)
            .filter(n->isPalindrome(n)&&isFactors(n))
            .map(n->(int)n)
            .findFirst().orElse(0);
    System.out.printLn(pal);
    private static boolean isPalindrome(int number) {
        return (number==Integer.valueOf(new StringBuilder(Integer.toString(number)).reverse().toString()));
    }

    //Можно ли представить это число в виде произведения двух двузначных чисел
    private static boolean isFactors(int number) {
        return IntStream.rangeClosed(10,99)
                .anyMatch(n->number%n==0&&number/n>9&&number/n<100);
    }
}
