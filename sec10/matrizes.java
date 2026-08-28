package sec10;

import java.util.Locale;
import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        int [][] mat = new int[n][n];  //[linha] [coluna]

        //para prencher as matrizes , tem q usar o for para linhas e outras para colunas 
        // Quantidade total tambem é length
        //Saber o tamanho da matriz seria mat.length

        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                mat[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("----------------------------");
        //mostrar a diagonal principal//
        System.out.println("Diagonal principal:");
        for(int i=0; i<n; i++){
            System.out.println(mat[i][i] + " ");
        }
        System.out.println("-------------------------");
        int cal =0;

        //numeros negativos na matriz
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]<0){
                    cal++;
                }
            }
        }
        System.out.println("Negatives numbers is :" + cal);
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
    }
    
}
