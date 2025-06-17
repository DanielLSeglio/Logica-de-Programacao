import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, maior, cont;

        System.out.println("Digite 5 números: ");

        // Lê o primeiro número e inicializa o maior com ele
        num = entrada.nextInt();
        maior = num;

        // Laço para ler os próximos 4 números
        for(cont = 1; cont <= 4; cont++ ){
            num = entrada.nextInt();

            // Verifica se o número atual é maior que o maior armazenado
            if (num > maior) {
                maior = num;
            }
        }

        entrada.close(); // Fecha o Scanner após a leitura de todos os números

        // Exibe o maior valor digitado
        System.out.println("Maior valor = " + maior);
    }
}