package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exerc67 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        exerc67_po x = new exerc67_po();

            System.out.println("Digite o numero da sua conta bancaria:");
            x.num = sc.nextDouble();

            System.out.println("Digite o nome da conta:");
            x.nome = sc.nextLine();

            sc.nextLine();

            System.out.println("Fará um deposito?");
            x.deposito = sc.nextLine();

            if(x.equals(x.deposito)){
                System.out.println("ERRO");
            }
            else{
                System.out.println("CERTO");
            }
        

    }
       }