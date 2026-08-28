package sec11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculosData {
    public static void main(String[] args) {
        
        //Soma de datas , subtração de datas e etc
        //O minusDays ta subtraindo a data que eu instanciei menos 7, ou seja uma semana antes
        //O plusDays ta adicionando dias , ou seja a data vai ser a da proxima semana 
        //plus(+) e minus(-)
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:20");
        Instant d03 = Instant.parse("2022-07-20T01:30:20Z");  
        
        LocalDate pastWeeklocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        LocalDateTime pastWeeklLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeeklLocalDateTime = d02.plusDays(7);

        Instant pastweekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextweekInstant = d03.plus(7, ChronoUnit.DAYS);


        System.out.println("Semana passada:" + pastWeeklocalDate);
        System.out.println("Proxima semana:" + nextWeekLocalDate);

        System.out.println("---------------------");

        System.out.println(pastWeeklLocalDateTime);
        System.out.println(nextWeeklLocalDateTime);

        System.out.println("----------------");

        System.out.println(pastweekInstant);//No instant é diferente , ele precisa colocar só minus(quantidade de dias, chronoUnit.days(minutos , decadas e etc)
        System.out.println(nextweekInstant); //Mesma coisa , aqui tem que colocar só o plus(quantidade de dias, chronoUnit.days(minutos, decadas e etc)) 
        
        System.out.println("-------------------------");
        //Duração agora:

       Duration t1 = Duration.between(pastWeeklocalDate.atTime(0,0), d01.atTime(0,0));
        Duration t2 = Duration.between(pastWeeklLocalDateTime, d02);
        Duration t3 = Duration.between(pastweekInstant, d03);
        Duration t4 = Duration.between(d03, pastweekInstant);

        System.out.println("t1=" + t1.toDays());//Nesses ele me falou a duração de uma semana antes até o dia que eu atribui na variavel t1
        System.out.println("t2=" + t2.toDays());
        System.out.println("t3=" + t3.toDays());
        System.out.println("t4=" + t4.toDays());//Nesse eu coloquei primeiro a data original , ai depois coloquei uma semana antes , ou seja ele me informou -7



    }
    
}
