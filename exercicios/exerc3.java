package exercicios;

import java.util.Scanner;

public class exerc3{
    public static void main(String[] args) {
        //Retangulo: Base e altura
        //Area, perimetro e diagonal

        Scanner sc = new Scanner(System.in);

        exerc c = new exerc();

        System.out.print("Digite a base do retangulo:");
        c.base = sc.nextDouble();

        System.out.print("Digite a altura do retangulo:");
        c.altura = sc.nextDouble();

        System.out.print("Digite a Base menor:");
        c.b = sc.nextDouble();

        System.out.print("Digite a Base maior:");
        c.B = sc.nextDouble();

        System.out.println("A area desse retangulo é de " + c.cal() + "\n");
        System.out.println("O perimetro desse retangulo é de " + c.cal2() + "\n");
        System.out.printf("A diagonal é de " +  c.cal3() + "cm\n");


    }
}