import java.util.ArrayList;

public class LastDigit {
    //Найти последнюю цифру выражения a^b, где a и b - целые числа.
    //Результат может быть очень большим.
    //
    //Для каждого числа от 0 до 9 вычислить все возможные последние цифры при возведении их в заданную степень.
    //Записать их в коллекцию ArrayList<ArrayList<Integer>>.
    //Найти закономерность при получении последней цифры.*/
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            res.add(new ArrayList<>());
            for (int j = 1; j < 10; j++) {
                int digit = (int)Math.pow(i,j)%10;
                if(!res.get(i).contains(digit))
                    res.get(i).add(((int)Math.pow(i,j))%10);
            }
            // System.out.println(res.get(i));
        }
        int a = 2;
        int b = 3;
        int lasta = a%10;
        int lastb = b%4==0?res.get(lasta).size()-1:b%res.get(lasta).size()-1;

        //int last = res.get(lasta).get(lastb);

        return (int)Math.pow(lasta,b%4)%10;

    }
}
