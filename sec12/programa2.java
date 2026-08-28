package sec12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import sec12.entities.Comentario2;
import sec12.entities.Comentarios;
import sec12.entities.Posts;

public class programa2 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

      DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       
      //Primeiro post:

      for(int i=0; i<1; i++){
        System.out.println("Post #" + 1); 
        System.out.println("Digite o titulo do post:");
         String titulo = sc.nextLine();

      System.out.println("Digite quantos likes ele tem:");
      int likes = sc.nextInt();

      sc.nextLine();

      System.out.println("Digite quanto ele foi postado (dia/mes/ano hora:minutos)");
      LocalDateTime momemento = LocalDateTime.parse(sc.nextLine(), fmt1);

      System.out.println("Tem quantos comentarios?");
      int qtd = sc.nextInt();

       

      sc.nextLine();

        for(int j=0; j<qtd; j++){
       
        System.out.println("Digite o " + (1+j) + " comentario");
        String comentario = sc.nextLine();

         vect[j] = new Comentarios(comentario);
      }
     
      }
      for(int i=0; i<1;i++){
        System.out.println("Post #" + 2); 
        System.out.println("Digite o titulo do post:");
         String titulo2 = sc.nextLine();

      System.out.println("Digite quantos likes ele tem:");
      int likes2 = sc.nextInt();

      sc.nextLine();

      System.out.println("Digite quanto ele foi postado (dia/mes/ano hora:minutos)");
      LocalDateTime momemento2 = LocalDateTime.parse(sc.nextLine(), fmt1);

      System.out.println("Tem quantos comentarios?");
      int qtd2 = sc.nextInt();

      Comentario2[] vect = new Comentario2[qtd2];

      sc.nextLine();

        for(int x=0; x<qtd2; x++){
       
        System.out.println("Digite o " + (1+x) + " comentario");
        String comentario2 = sc.nextLine();

        vect[x] =  new Comentario2(comentario2);

        
      }
      
      
     }
      }
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

     
     
     
     
     




    
    
    
    
    

