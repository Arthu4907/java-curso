package sec11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localdate {
    public static void main(String[] args) {
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:25");
        Instant d06 = Instant.parse("2022-07-20T01:30:25Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2022" , fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30" , fmt2);

        LocalDate d10 = LocalDate.of(2026, 8, 22);
        LocalDateTime  d11 = LocalDateTime.of(2027, 8, 22, 18, 00);


        System.out.println(d01); //Isso faz o java pegar a data de hj no sistema e mostrar na tela!
        System.out.println("--------------------");
        System.out.println(d02);//Isso faz o java pegar a data de hj no sistema , o tempo e com os segundo , mostrando assim na tela!
        System.out.println("-------------------");
        System.out.println(d03);//Isso faz com que mostre na tela a data de hj e o horario local do sistema , só que convertido para o horario de Londres nesse (Z) no final
        System.out.println("----------------");
        System.out.println(d04);//Isso faz com que mostre a data que eu quero , dentro do texto digitado!
        System.out.println("------------------");
        System.out.println(d05);//Isso faz com que possa mostrar a hora , data , segundo de acordo com o que eu escrevi na caixa de texto 
        System.out.println("--------------");
        System.out.println(d06);//Data, hora , segundo no horario global de londres
        System.out.println("-------------");
        System.out.println(d07);//Mostra que o horario global e como seria no horario do Brasil 
        System.out.println("--------------");
        System.out.println(d08);//Se eu quiser escrever da forma tradicional como 10/12/2007 , eu tenho que formatar para que o sistema aceite , para não dar erro
        System.out.println("-----------");
        System.out.println(d09);//Se eu quiser escrever da forma tradicional como 10/12/2007 7:20 , eu tenho que formatar para que o sistema aceite , para não dar erro , assim podendo aceitar da forma que escrevi
        System.out.println("-----------------");
        System.out.println(d10);
        System.out.println("------------------");
        System.out.println(d11);

        
        ///Ainda n terminei o codigo , tive que me arrumas , mas parei no d10 e no d11


    }
    
}
