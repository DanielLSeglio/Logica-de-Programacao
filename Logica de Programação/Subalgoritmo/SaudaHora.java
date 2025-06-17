import java.util.Scanner; // Importa Scanner para entrada de dados

public class SaudaHora {

    // Programa Principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora;

        System.out.print("Digite seu Horario (Ex: 12 para 12 horas): ");
        hora = entrada.nextInt(); // Lê a hora informada pelo usuário

        saudacao(hora); // Chama o procedimento passando a hora como parâmetro

        entrada.close(); // Fecha o Scanner após uso
    }

    // Procedimento que exibe uma saudação baseada no horário informado
    public static void saudacao(int hora) {
        String msg;

        if (hora < 6)
            msg = "Boa Madrugada!"; // Horário antes das 6h
        else if (hora < 12)
            msg = "Bom Dia!"; // Horário entre 6h e 11h59
        else if (hora < 18)
            msg = "Boa Tarde!"; // Horário entre 12h e 17h59
        else if (hora < 24)
            msg = "Boa Noite!"; // Horário entre 18h e 23h59
        else
            msg = "Horario Indisponível."; // Qualquer valor inválido

        // Exibe a saudação concatenada com a mensagem de boas-vindas
        System.out.println(msg + " Seja Bem-Vindo a FIAP!");
    }
}