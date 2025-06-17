import java.util.Scanner;

public class Precondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao;

        System.out.println("Digite [S] para sim ou [N] para não: ");
        opcao = entrada.nextLine().trim().toUpperCase();

        while (! (opcao.equals("S") || opcao.equals("N"))) {
            System.out.println("Voce digitou errado, digite [S] ou [N].");

            System.out.println("Digite [S] para sim ou [N] para não: ");
            opcao = entrada.next().trim().toUpperCase();
        }

        System.err.println("Voce digitou: " + opcao);

        entrada.close();
    }
}
