package sec7;

public class sec7_rasc {
    
    public static final double DOLAR = 5.13;
    public double qtd;
    
    public  double cal(){
        return ( DOLAR * qtd ) + ( DOLAR * qtd * 0.06) / 100;
    }
    

}
