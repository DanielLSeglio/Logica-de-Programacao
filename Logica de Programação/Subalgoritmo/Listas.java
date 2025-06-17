import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class Listas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        int vetor[] = new int[5]; // Declara um vetor de inteiros com 5 posições
        int i; // Declara uma variável de controle para os loops

        System.out.println("Preenchendo o vetor...");
        // Loop para preencher o vetor com valores informados pelo usuário
        for (i = 0; i < 5; i++) {
            System.out.print("Posição [" + i + "] = ");
            vetor[i] = entrada.nextInt(); // Lê um número inteiro e armazena na posição i do vetor

            entrada.close(); // <- ERRO: Fechar o Scanner dentro do loop faz com que ele feche na primeira execução. 
                             // Isso gera erro nas próximas leituras. O correto seria fechar após todos os usos, no final do programa.
        }

        System.out.println("\nExibindo o vetor...");
        // Loop para exibir os valores armazenados no vetor
        for (i = 0; i < 5; i++) {
            System.out.println("Vetor [" + i + "] = " + vetor[i]);
        }

        int soma;
        soma = 0; // Inicializa a variável soma com 0

        // Loop para somar todos os elementos do vetor
        for (i = 0; i < 5; i++) {
            soma = soma + vetor[i]; // Soma acumulando os valores do vetor
        }

        // Exibe a soma total dos valores do vetor
        System.out.println("\nSoma = " + soma);
    }
}
