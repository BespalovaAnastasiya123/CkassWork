package MagicBox;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MagicBoxDemo {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
       // magicBox.setObject(1);
        //magicBox.setObject("abc");
        //magicBox.setObject(LocalDate.now());
       // magicBox.setObject(new ArrayList<String>(Arrays.asList("hocus", "pocus")));
        magicBox.setObject(new MagicBox());
        System.out.println(magicBox.getObject());

        Object object = magicBox.getObject();

        Class clazz = object.getClass();//Reflection

        System.out.println(clazz);

        MagicBoxGeneric<Integer> magicBoxGeneric = new MagicBoxGeneric<>();
       // magicBoxGeneric.setObject(1);
        //magicBoxGeneric.setObject("1");
        System.out.println(magicBoxGeneric.getObject());

        MagicBoxGeneric<MagicBoxGeneric<Integer>> magicBoxGeneric2 = new MagicBoxGeneric<>();
        magicBoxGeneric2.setObject(new MagicBoxGeneric<>());
        magicBoxGeneric2.getObject().setObject(1);
        System.out.println(magicBoxGeneric2.getObject().getObject());




    }
}
class MagicBox{//контейнер
    private Object object;//"матрешка"/зачем ???

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "MagicBox{" +
                "object=" + object +
                '}';
    }
}

class MagicBoxGeneric<T>{//Параметризованный класс (Generic класс)
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
