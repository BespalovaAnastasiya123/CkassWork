import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Interface {

        public static void main(String[] args) {
            LocalDate date = LocalDate.now();
            System.out.println(date);

            LocalTime time = LocalTime.now();
            System.out.println(time);

            LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("America/New_York"));
            System.out.println(dateTime);

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");
            String formattedDate = dateTimeFormatter.format(dateTime);
            System.out.println(formattedDate);
        }
    }


