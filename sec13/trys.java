package sec13;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class trys {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       try {
        String[] vect = sc.nextLine().split(" ");
        int posi = sc.nextInt();

        System.out.println(vect[posi]);
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid position!");
       }
       catch(InputMismatchException e){
        System.out.println("input invalid");
       }
       System.out.println("End of program");

    }
    
}
