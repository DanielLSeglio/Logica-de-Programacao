import java.util.Scanner; // Importa a classe Scanner para entrada de dados (não usada aqui, mas está declarada)

public class Saudacao {

    // Programa Principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria o objeto Scanner (não utilizado no código atual)

        saudacao(); // Chama o procedimento saudacao()

        entrada.close(); // Fecha o Scanner (boa prática)
    }

    // Procedimento que exibe uma saudação na tela
    public static void saudacao() {
        System.out.println("Seja Bem-Vindo a FIAP!");
    }
}
