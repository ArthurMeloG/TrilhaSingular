import java.sql.SQLOutput;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // data e hora são objetos imutáveis
        // localDate, LocalDateTime, Instant, Duration, ZoneId, ChronoUnit
//
//        LocalDate date = LocalDate.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        Instant instantTime = Instant.now();

//        System.out.println(date);
//        System.out.println(dateTime);
//        System.out.println(instantTime);


//        LocalDate localDate = LocalDate.parse("2024-08-06");
//        LocalDateTime localDateTime = LocalDateTime.parse("2024-08-06T20:30:30");
//        Instant instant = Instant.parse("2024-08-06T20:30:03Z");
//
//        System.out.println(localDate);
//        System.out.println(localDateTime);
//        System.out.println(instant);
//
//        System.out.println(localDateTime.getDayOfMonth());
//        System.out.println(localDateTime.getMonth());
//        System.out.println(localDateTime.getHour());
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate dateFormated = LocalDate.parse("20/11/1999", dateTimeFormatter);
//
//        Date dateType = Date.from(instant);
//        System.out.println(dateType);
///

//        System.out.println(fromString);
//        System.out.println(dateFormater);
//
//        System.out.println(fromString.format(dateTimeFormatter));
//        // o instante precisa especificar com zona
//        DateTimeFormatter dateTimeFormatterInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
//        System.out.println(dateTimeFormatterInstant.format(instant));
//        https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
//
//        //Datas locais
//        for (String s :ZoneId.getAvailableZoneIds()) System.out.println(s);
//        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
//        System.out.println(localDate);
//

//          LocalDate r1 = LocalDate.ofInstant(instant, ZoneId.systemDefault());
//        // calculo com datas
//        LocalDate hoje = LocalDate.now();
//        LocalDate pastWeek = hoje.minusDays(7);
//
//        System.out.println(hoje);
//        System.out.println(pastWeek);
//
////        Instant past = instant.minus(7, ChronoUnit.DAYS);
//
//        Duration tempo = Duration.between(fromString, dateTime);
//        System.out.println("Tempo: " + tempo.toDays());

        LocalDate d04 = LocalDate.parse("2022-07-20");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);
        System.out.println(pastWeekInstant);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println(t1.toDays());
    }
}