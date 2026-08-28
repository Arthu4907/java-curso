package sec5;

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    double preco = 600.00;
    double desconto;

if (preco > 200.00){
    desconto = preco * 0.5;
}else{
    desconto = preco * 0.1;
}
System.out.println(desconto);
    }
}
