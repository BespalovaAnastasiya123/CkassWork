package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task {
    public static void main(String[] args) {
      /*  Stack<String> stack = new Stack<>();
        stack.push("1");
        String s = stack.pop();*/

        //Упаковка большой коробка
        List<Stack<String>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Stack<String> stack = new Stack<>();
            for(int j=0; j<5;j++)
                stack.push(String.format("string %d", i*5+j));
            list.add(stack);
        }
        //Изменение 2-й строки в 1й коробке

        String<String> stack = list.get(1);
        stack.set(2, "tring selected");

        //Распаковка
        for(int i = 0; i<list.size(); i++)
            Stack<String> stack = list.get(i);
        while(!stack.empty()){
            String s = stack.pop();
            System.out.print(s+ "  ");
        }
        System.out.println();
    }

        }



