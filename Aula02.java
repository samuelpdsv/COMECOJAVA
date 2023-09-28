import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int moto;
        int carro;

        System.out.println("VOCÊ VAI A FACULDADE DE CARRO? (1 P/ SIM E 2 P/ NÃO)");
        carro = entrada.nextInt();

        System.out.println("VOCÊ VAI A FACULDADE DE MOTO? (1 P/ SIM E 2 P/ NÃO");
        moto = entrada.nextInt();

        if ((carro ==1 && moto == 2) || (carro == 2 && moto == 1)) {
            System.out.println("VOCÊ É PRIVILEGIADO! SAFADO.");
        }
        else if (carro == 2 && moto == 2){
            System.out.println("VOCÊ É POBRE! KSKSKSKS");
        }
        else{
            System.out.println("IDIOTA, É 1 OU 2 MULA! NÃO PÕE OUTRO NÚMERO ANTA.");
        }
    }
}
