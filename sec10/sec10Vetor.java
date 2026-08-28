package sec10;

import java.util.Locale;
import java.util.Scanner;

public class sec10Vetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       System.out.println("Digite quantos alunos vão alugar os apartamentos:");
       int x = sc.nextInt();

       if(x > 10 || x < 0){
        System.out.println("ERRO");
       }
       else {
        classe_estudante vect[] = new classe_estudante[x];
        sc.nextLine();
        for(int i = 0; i<x; i++){
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Email:");
            String email = sc.nextLine();
            System.out.println("Quarto:");
            int local = sc.nextInt();
            sc.nextLine();
            vect[i] = new classe_estudante(nome, email, local);
        }
        for(int i =0; i<x; i++){
            System.out.println(vect[i]);
       
           
       }

    }
}}
