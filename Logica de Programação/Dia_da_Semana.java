import java.util.Scanner; // Importa Scanner para entrada do usuário

public class Dia_da_Semana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;

        System.out.println("Escolha um número de 1 a 7: ");
        dia = entrada.nextInt(); // Lê o número digitado pelo usuário

        // Usa switch para mapear o número ao dia da semana correspondente
        switch (dia) {
            case 1: System.out.print("Domingo"); break;
            case 2: System.out.print("Segunda-Feira"); break;
            case 3: System.out.print("Terça-Feira"); break;
            case 4: System.out.print("Quarta-Feira"); break;
            case 5: System.out.print("Quinta-Feira"); break;
            case 6: System.out.print("Sexta-Feira"); break;
            case 7: System.out.print("Sábado"); break;
            default: System.out.print("Dia Inválido!"); break; // Caso o número não seja entre 1 e 7
        }

        entrada.close(); // Fecha o scanner após o uso
    }
}