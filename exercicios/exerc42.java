package exercicios;

import java.util.Scanner;

public class exerc42 {
    public static void main(String[] args) {
    //nome, salario , imposto
    //mostrar nome e salario liquido
    //aumentar o salario com uma porcentagem
    //mostrar os dados novamente
    
    Scanner sc = new Scanner(System.in);
    exerc1_poo r = new exerc1_poo();

    System.out.println("Digite seu nome");
    r.nome = sc.nextLine();

    System.out.println("Digite seu salario:");
    r.sala = sc.nextDouble();

    System.out.println("Digite quanto de imposto você paga por mês:");
    r.imposto = sc.nextDouble();

    System.out.println("Nome: " +  r.nome + " e o salario liquido é " + r.cal2() );

    System.out.println("Nome: " + r.nome + " e o salario com o aumento é de " + r.cal3());




}


}
