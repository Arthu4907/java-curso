package exercicios;

public class exerc1_poo {
    
    public String nome;
    public double sala;
    public double imposto;
    
    //calculo com o imposto
    public double cal(){
       return (sala * imposto)/100;
    }
    //salario liquido
    public double cal2(){
        return sala - cal();
    }
    //aumento
    public double cal3(){
        return ((sala*imposto)/100 + cal2());
    }


}
