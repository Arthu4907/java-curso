package sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> lista = new ArrayList<>();

        System.out.println("Digite quantos funcionais estão registrados:");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println();
            System.out.println("Funcionario " + (i + 1) + ":");

            System.out.print("Id:");
            Integer id = sc.nextInt();

            System.out.print("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Salario:");
            double salario = sc.nextDouble();

            Funcionarios dados = new Funcionarios(nome, id, salario);

            lista.add(dados);
        }
        System.out.println("Digite o id do funcionario que vai ter o salario aumentado:");
        Integer idsalary = sc.nextInt();
        Integer pos = hasId(lista, idsalary);
        if (pos == null) {
            System.out.println("Não tem esse id");
        } else {
            System.out.println("Digite a porcentagem que vai aumentar o salario:");
            double percent = sc.nextDouble();
            lista.get(pos).salarioMaior(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");

        for (Funcionarios dados : lista) {
            System.out.println(dados);
        }

        sc.close();
    }

    public static Integer hasId(List<Funcionarios> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
