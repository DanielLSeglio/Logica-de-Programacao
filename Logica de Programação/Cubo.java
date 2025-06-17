import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Cubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o objeto Scanner para ler dados do usuário
        double num, cubo;

        System.out.print("Digite um número: ");
        num = entrada.nextDouble(); // Lê um número do tipo double

        cubo = num * num * num; // Calcula o cubo do número

        System.out.println("O cubo de " + num + " é: " + cubo); // Exibe o resultado

        entrada.close(); // Fecha o Scanner (boa prática)
    }
}