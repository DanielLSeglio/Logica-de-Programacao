import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o objeto Scanner para ler dados do teclado

        int matriz[][] = new int[4][2]; // Declara uma matriz de 4 linhas e 2 colunas
        int l, c; // Variáveis auxiliares para controle dos loops (linha e coluna)

        System.out.println("Preenchendo a matriz...");
        // Loop para preencher a matriz com valores informados pelo usuário
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 2; c++) {
                System.out.print("Posição [" + l + "][" + c + "] = ");
                matriz[l][c] = entrada.nextInt(); // Lê o valor e armazena na posição [l][c] da matriz
            }
        }

        System.out.println("\nExibindo a matriz...");
        // Loop para exibir os valores da matriz em formato tabular
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 2; c++) {
                System.out.print(matriz[l][c] + "\t"); // "\t" cria uma tabulação (espaço)
            }
            System.out.println(); // Quebra de linha a cada linha da matriz
        }

        int soma = 0; // Variável que armazenará a soma dos elementos da matriz

        System.out.println("\nSomando a matriz...");
        // Loop para somar todos os elementos da matriz
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 2; c++) {
                soma = soma + matriz[l][c]; // Acumula os valores na variável soma
            }
        }

        // Exibe o resultado da soma total dos elementos da matriz
        System.out.println("Soma = " + soma);

        entrada.close(); // Fecha o Scanner após o uso
    }
}

