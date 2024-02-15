import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobileCode {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(24, "Белтелеком (Максифон)");
        map.put(25, "life");
        map.put(291, "Velcom");
        map.put(292, "МТС");
        map.put(293, "Velcom");
        map.put(294, "Diallog");
        map.put(295, "МТС");
        map.put(296, "Velcom");
        map.put(297, "МТС");
        map.put(298, "МТС");
        map.put(299, "Velcom");
        map.put(33, "МТС");
        map.put(44, "Velcom");
        String phone = "+375333537184";

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (phone.indexOf(entry.getKey().toString()) == 4)
                System.out.println(entry.getValue());
        }

    }
}
