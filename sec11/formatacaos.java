package sec11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class formatacaos {
    public static void main(String[] args) {
        
        //trasformando data para String

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        

        System.out.println(d01.format(fmt1));//Mesma coisa do de baixo, só inverteu a ordem
        System.out.println(fmt1.format(d01));
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d02.format(fmt2));

        System.out.println(fmt3.format(d03));//Quando for instant precisa especificar o fuso horario , o zone usado no fmt3 faz com que o sistema pegue o fuso horario do sistema do computador, assim convertendo aquela hora para o meu fuso horario, isso sendo obrigatorio com o instant 

        System.out.println(d02.format(fmt6));//podemos usar os isos para simplificar o codigo , como o iso_date_time e entre outros 


    }
}
