import java.time.*;
import java.time.format.*;
public class Main {
    public static void main(String[] args) {
        // data e hora são objetos imutáveis
        // localDate, LocalDateTime, Instant, Duration, ZoneId, ChronoUnit

        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        // data e hora global
        Instant instant = Instant.now();
        LocalDateTime fromString = LocalDateTime.parse("2024-08-06T20:30:30");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFormater = LocalDate.parse("20/11/1999", dateTimeFormatter);

        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println(fromString);
        System.out.println(dateFormater);

        System.out.println(fromString.format(dateTimeFormatter));
        // o instante precisa especificar com zona
        DateTimeFormatter dateTimeFormatterInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(dateTimeFormatterInstant.format(instant));
        https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        //Datas locais
        for (String s :ZoneId.getAvailableZoneIds()) System.out.println(s);
        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDate);

        // calculo com datas
        LocalDate hoje = LocalDate.now();
        LocalDate pastWeek = hoje.minusDays(7);

        System.out.println(hoje);
        System.out.println(pastWeek);

//        Instant past = instant.minus(7, ChronoUnit.DAYS);

        Duration tempo = Duration.between(fromString, dateTime);
        System.out.println("Tempo: " + tempo.toDays());
    }
}