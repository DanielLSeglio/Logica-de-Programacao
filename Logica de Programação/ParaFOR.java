
import java.util.Scanner;

public class ParaFOR {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int ini, fim, cont;

        System.out.println("Digite um numero para começo e fim: ");
        ini = entrada.nextInt();
        fim = entrada.nextInt();

        for(cont = ini; cont <= fim; cont++ ){
            System.out.println(cont);
            entrada.close();
        }

        entrada.close();
    }
}
