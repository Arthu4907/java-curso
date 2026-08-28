package exercicios;

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
      //nome de 3 alunos e 3 notas
      //3 trimestres = 90 dias
      //1 trimestre vale 30
      //2 e o 3 valem 35
      //falar se ele passou ou não de ano
    Scanner sc = new Scanner(System.in);
     exerc2Poo r = new exerc2Poo();
     
    System.out.println("Digite o primeiro nome:");
    r.nome1 = sc.nextLine();

    System.out.println("Digite quanto ele tirou no primeiro trimestre:");
    r.nome_um_uno = sc.nextDouble();

    System.out.println("Digite quanto ele tirou no segundo trimestre:");
    r.nome_um_two = sc.nextDouble();
    
    System.out.println("Digite quanto ele tirou no terceiro trimestre:");
    r.nome_um_tree = sc.nextDouble();
    
    
    sc.nextLine();
    
    System.out.println("Digite o nome do segundo aluno:");
    r.nome2 = sc.nextLine();

    System.out.println("Digite a nota do primeiro trimestre:");
    r.nome_dois_uno = sc.nextDouble();

    System.out.println("Digite a nota do segundo trimestre:");
    r.nome_dois_two = sc.nextDouble();
    
    System.out.println("Digite a nota do terceiro trimestre:");
    r.nome_dois_tree = sc.nextDouble();

   
    sc.nextLine();

    System.out.println("Digite o nome do terceiro aluno:");
    r.nome3 = sc.nextLine();

    System.out.println("Digite a nota do primeiro trimestre:");
    r.nome_tres_uno = sc.nextDouble();

    System.out.println("Digite a nota do segundo trimestre:");
    r.nome_tres_two = sc.nextDouble();
    
    System.out.println("Digite a nota do terceiro trimestre:");
    r.nome_tres_tree = sc.nextDouble();

    if(r.cal1() < 0 && r.cal2() < 0 && r.cal3() < 0 && r.cal2() > 35 && r.cal3() > 35 && r.cal1() > 30){
        System.out.println("ERRO");
    }
    else if(r.cal1() >= 6 && r.cal2() >= 6.0 && r.cal3() >= 6.0){
        System.out.println("Aprovado");
    }
    else if(r.cal1() >= 6.0 && r.cal2() >= 6.0 && r.cal3() < 6.0){
        System.out.println(r.nome1 + " e " + r.nome2 + " estão aprovados , mas o(a) " + r.nome3 + " está reprovado, faltando " + r.test3() + " pontos para atigingir a media ");
    }
    else if (r.cal1() >= 6.0 && r.cal2() < 6.0 && r.cal3() >= 6.0){
        System.out.println(r.nome1 + " e " + r.nome3 + " estão aprovados, mas o(a) " + r.nome2 + " está reprovado, faltando " + r.test2() + " pontos para atigingir a media ");
    }
    else if (r.cal1() < 6.0 && r.cal2() >= 6.0 && r.cal3() >= 6.0){
        System.out.println(r.nome2 + " e " + r.nome3 + " estão aprovados, mas o(a) " + r.nome1 + " está reprovado, faltando " + r.test1() + " pontos para atigingir a media");
    }
    else{
        System.out.println("Estão todos reprovados , " + r.nome1 + " ficou faltando " + r.test1() + " pontos ," + r.nome2 + " ficou faltando " + r.test2() + " pontos e o(a) ficou faltando " + r.test3() + " pontos " );
    }





    }
}

