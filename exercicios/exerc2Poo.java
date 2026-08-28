package exercicios;

public class exerc2Poo {
    
    public String nome1;
    public String nome2;
    public String nome3;

    public double nome_um_uno;
    public double nome_um_two;
    public double nome_um_tree;
    
    public double nome_dois_uno;
    public double nome_dois_two;
    public double nome_dois_tree;
    
    public double nome_tres_uno;
    public double nome_tres_two;
    public double nome_tres_tree;

    public double cal1(){
        return (nome_um_uno + nome_um_two + nome_um_tree)/3;
    }

    public double cal2(){
        return (nome_dois_uno + nome_dois_two + nome_dois_tree) / 3;
    }

    public double cal3(){
        return (nome_tres_uno + nome_tres_two + nome_tres_tree)/3;
    }

    public double test1(){
        return 6.00 - cal1();
    }
    public double test2(){
        return 6.00 - cal2();
    }
    public double test3(){
        return 6.00 - cal3();
    }

    


}
