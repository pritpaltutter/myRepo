package LocalDate;

import java.time.LocalDateTime;

public class DateClassTest {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);

        System.out.println(ldt.toLocalDate());

    }
}
