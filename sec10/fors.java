package sec10;

public class fors {
    public static void main(String[] args) {
        
      String[] vect = new String[] {"Maria","Pedro", "João", "Lana" }  ;

      //1 forma do for - forma tradicional
      for(int i=0; i<vect.length; i++){
        System.out.println(vect[i]);
      }
      System.out.println("-----------------------------------------------");
      //2 forma do for - Laço "for each" , ele serve para percorrer todos os elementos de um coleção ou vetor 
      for (String obj : vect) {
          System.out.println(obj);
      }
    }
}
