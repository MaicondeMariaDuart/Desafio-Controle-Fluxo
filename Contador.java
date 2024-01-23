import java.util.Scanner;

public class Contador {

      public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
            
        
            System.out.println("Digite o primeiro numero");
            int numeroum = scanner.nextInt();
        
            System.out.println("Digite o segundo numero");
            int numerodois = scanner.nextInt();

            if (numerodois < numeroum) {
              System.out.println("O segundo parametro deve ser maior que o primeiro!");
            }else
        
               for (int x=0;x<=numeroum;numerodois--)
              {
                System.out.println("Imprimindo o 1º numero: "+numeroum-- +"  e o 2º numero: " +numerodois);
                
              }
           
          }
            
         
        
        
}
    
