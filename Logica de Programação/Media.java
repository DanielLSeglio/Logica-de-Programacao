import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        System.out.print("Digite o primeiro numero: ");
        n1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        n3 = entrada.nextDouble();

        System.out.print("Digite o quarto numero: ");
        n4 = entrada.nextDouble();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.print("A media é : " + media);

        entrada.close();

    }
    
}
