import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate copaDoMundo = LocalDate.of(2022, Month.NOVEMBER, 21);

        int anos = copaDoMundo.getYear() - hoje.getYear();

        System.out.println(anos);

        Period period = Period.between(hoje, copaDoMundo);
        System.out.println(period.getDays());

        LocalDate proximaCopa = copaDoMundo.plusYears(4);
        System.out.println(proximaCopa);

        System.out.println(proximaCopa.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
    }
}
