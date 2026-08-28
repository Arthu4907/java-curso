package sec6;

import java.util.Scanner;

public class sec_while {
    public static void main(String[] args) {
/*While estrutura:
while( condição){
    comando 1
    comando 2
}
*/        
Scanner sc = new Scanner(System.in);
    
int x = 1;
int soma = 0;
while(x != 0){
    soma = soma + x;
   System.out.println("Digite um nuumero:");
    x = sc.nextInt();
}




    sc.close();
}

}
