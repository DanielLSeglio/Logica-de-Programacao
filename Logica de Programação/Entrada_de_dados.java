import java.util.Scanner;

public class Entrada_de_dados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria objeto para ler entrada do usuário
        int num, dobro;

        System.out.print("Digite um número: ");
        num = entrada.nextInt(); // Lê um número inteiro

        dobro = num + num; // Calcula o dobro somando o número com ele mesmo

        System.out.print("Dobro = " + dobro); // Exibe o resultado

        entrada.close(); // Fecha o Scanner para liberar recursos
    }
}
