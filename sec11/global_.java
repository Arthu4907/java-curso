package sec11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class global_ {
    public static void main(String[] args) {

        //Convertendo data-hora-global para data-hora-local
        
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02= LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);//Aqui eu to especifricando para ele converte para o dia do sistema do meu computador com o SystemDefault
        System.out.println("r2 = " + r2);//Aqui eu to especificando para ele converte para o dia de portugal , de acordo com o fusorario de lá
        System.out.println("r3 = " + r3);//Aqui ele ta fazendo a mesma coisa , só que agora ele tambem está especificando a hora com a data do sistema local
        System.out.println("r4 = " + r4);//Aqui ele ta fazendo a mesma coisa , só que ele ta usando data-hora especificamente de Portugal
        

        System.out.println("d01=" + d01.getDayOfMonth());
        System.out.println("d01=" + d01.getMonthValue());
        System.out.println("d01=" + d01.getYear());

        System.out.println("d02 = " + d02.getHour());
        System.out.println("d02 = " + d02.getMinute());
        System.out.println("d02 = " + d02.getSecond() );



    }
}
