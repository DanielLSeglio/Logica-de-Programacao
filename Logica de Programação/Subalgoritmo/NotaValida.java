import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class NotaValida {

    // Método que verifica se a nota é válida (entre 0 e 10)
    public static boolean notaValida(double nota) {
        if (nota >= 0 && nota <= 10)
            return true; // Retorna verdadeiro se a nota estiver no intervalo válido
        else
            return false; // Retorna falso se a nota for inválida
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o objeto Scanner para ler dados do teclado
        double nota1, nota2, media; // Declaração das variáveis

        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble(); // Lê a primeira nota

        // Verifica se a primeira nota é válida
        if (notaValida(nota1)) {
            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextDouble(); // Lê a segunda nota

            // Verifica se a segunda nota é válida
            if (notaValida(nota2)) {
                media = (nota1 + nota2) / 2; // Calcula a média
                System.out.println("Sua média é de " + media); // Exibe a média
            } else {
                System.out.println("Nota 2 é inválida!"); // Mensagem se a segunda nota for inválida
            }
        } else {
            System.out.println("Nota 1 é inválida!"); // Mensagem se a primeira nota for inválida
        }

        entrada.close(); // Fecha o Scanner após o uso (boa prática)
    }
}
