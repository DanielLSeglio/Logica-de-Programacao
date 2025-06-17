import java.util.Scanner;

public class ParaWHILE {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int ini, fim;

        System.out.println("Digite um numero para começo e fim: ");
        ini = entrada.nextInt();
        fim = entrada.nextInt();

        while (ini <= fim){
            System.out.println(ini);
            ini++;
            entrada.close();
        }

        entrada.close();
    }
}
