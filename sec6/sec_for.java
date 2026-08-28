package sec6;

import java.util.Scanner;

public class sec_for {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  /*for 
    
  for (inicio ; condição ; incremento){
  comando 1;
  comando 2;
    }*/  

  int N;
  int soma = 0;

  System.out.println("Digite a quantidade:");
  N = sc.nextInt();

  for (int i = 0; i< N; i = i + 1) {
     int x;
     System.out.println("Digite o numero:");
     x = sc.nextInt();
     soma = soma + x; 
  }
  System.out.println(soma);
    }
}
