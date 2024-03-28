package magicBoxBounded;

public class BoundedDemo {
    public static void main(String[] args) {
        MBBounded<Animal> mbBounded = new MBBounded<>(new Cat());
        //wildcard
        MBBounded<?> mbBounded1 = new MBBounded<>(new Bird());
        //upper bounded (граница сверху)
        MBBounded<? extends  Bird> mbBounded2 = new MBBounded<>(new WhitePigeon());

        //lower bounded (граница снизу)
        MBBounded<? super Pigeon> mbBounded3 = new MBBounded<>(new Sparrow());//применение слова супер нелогично, наследуются и потомкиб и родитель


    }
}
class MBBounded<T>{
    private T obj;

    public MBBounded(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
