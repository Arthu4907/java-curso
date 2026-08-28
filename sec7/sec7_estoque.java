package sec7;

import java.util.Scanner;

public class sec7_estoque {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    //nome do produto, quantidade no estoque , preço , valor total no estoque

    sec7_oop2 nome, qtd , preco ,conta, adicionar, retirar, conta2, conta3, qtd2, qtd3;
    
    nome = new sec7_oop2();
    
    qtd = new sec7_oop2();
    qtd2 = new sec7_oop2();
    qtd3 = new sec7_oop2();

    preco = new sec7_oop2();
    conta = new sec7_oop2();
    
    adicionar = new sec7_oop2();
    retirar = new sec7_oop2();
    
    conta2 = new sec7_oop2();
    conta3 = new sec7_oop2();

   

    System.out.println("Digite o nome do produto:");
    nome.nome = sc.nextLine();

    System.out.println("Digite quantos produtos tem:");
    qtd.qtd = sc.nextInt();

    System.out.println("Digite o preço do produto:");
    preco.preco = sc.nextDouble();

    conta.conta = qtd.qtd * preco.preco;

    System.out.println("No estoque de " + nome.nome + " tem " + qtd.qtd + " unidades e o preço total do estoque é de " + conta.conta + " reais\n");

    System.out.println("Digite quantos numeros serão adicionados ao estoque:");
     adicionar.adicionar = sc.nextInt();

     qtd2.qtd2 = qtd.qtd + adicionar.adicionar;
     conta2.conta2 = (preco.preco * adicionar.adicionar) + conta.conta;

     System.out.println("Agora no estoque de " + nome.nome + " tem " + qtd2.qtd2 + " unidades e o valor total do estoque é de " + conta2.conta2 + " reais\n");

        System.out.println("Digite quantas unidades serão retiradas do estoque:");
        retirar.retirar = sc.nextInt();

        qtd3.qtd3 = qtd2.qtd2 - retirar.retirar;
        conta3.conta3 =  conta2.conta2 - (preco.preco * retirar.retirar);

        System.out.println("No estoque de " + nome.nome + " tem " + qtd3.qtd3 + " unidades e o valor total do estoque é de " + conta3.conta3 + " reais");




    }
}
