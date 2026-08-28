package sec7;
import java.util.Locale;
import java.util.Scanner;
public class sec7_estatico{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
    

        sec7_rasc x = new sec7_rasc();

        System.out.println("Digite quantos dolares você deseja comprar:");
        x.qtd = sc.nextInt();

        System.out.printf("Você pagara %.2f pelos " + x.qtd + " dolares ", x.cal() );
    }
}