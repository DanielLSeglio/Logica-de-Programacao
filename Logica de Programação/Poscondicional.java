import java.util.Scanner;

public class Poscondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, soma = 0;

        do{
            System.out.println("Digite um numero para soma: ");
            num = entrada.nextInt();
            if (num > 0) {
                soma = soma + num;
            }
            
        }while (num >= 0);

        System.out.println("Soma = " + soma);
        entrada.close();
    }
}
