package sec5;

import java.util.Scanner;

public class demo {
 public static void main(String[] args) {
   
/*Aqui eu fiz de uma forma mais facil , na expressão do desconto eu usei " caso o preço seja menor que 20 ele vai multiplicar por 0.1 , mas caso seja maior que 20 ele ira multiplicar por 0.05, assim não precisando usando o if else ou o swith case" */
  Scanner sc = new Scanner(System.in); 
  
  double preco = 34.5;
  double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

  System.out.println(desconto);


}
}