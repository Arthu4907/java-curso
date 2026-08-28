package sec7;

import java.util.Scanner;

public class sec7_media {
     public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);

    sec7_oop x, y, c, d;
    x = new sec7_oop();
    y = new sec7_oop();
    c = new sec7_oop();
    


    System.out.println("Digite o primeiro valor:");
    x.x = sc.nextInt();

    System.out.println("Digite o valor do segundo valor");
    y.y = sc.nextInt();

    c.c = (x.x + y.y)/2;

    System.out.println( "A média é " + c.c);
 




     }
}
