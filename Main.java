/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




import java.util.Scanner;
 public class Main
{
    
    public static void main (String[] args) {
      Scanner entrada = new Scanner (System.in);
      
      int velocidade;
      int longitude;
      int t;  // é necessário criar uma variavel para guardar o valor do resultado da operação
     
      
      System.out.println("QUAL É A VELOCIDADE EM QUE SEU CARRO ESTÁ?\n -- DIGITE -- \n");
      velocidade = entrada.nextInt();
      
      System.out.println("QUAL É A DISTANCIA QUE VOCê está DO SEU DESTINO? --DIGITE--");
      longitude = entrada.nextInt();
      
      
      t = longitude / velocidade; // Operação
      System.out.println("O tempo para sua chegada lá é em aproximadamente " + t + " horas");
      // acima as informações estão concatenadas.
     

    }
}
