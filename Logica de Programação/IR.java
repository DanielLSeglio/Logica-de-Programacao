import java.util.Scanner;

public class IR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sal;

        System.out.println("Digite seu salário: ");
        sal = entrada.nextDouble(); // Lê o salário informado pelo usuário

        // Verifica se o salário está acima do limite para isenção
        if (sal > 2500) {

            // Faixa de imposto de 7,5%
            if (sal <= 3500) {
                System.out.print("Seu imposto de renda é de 7,5%.");
            }
            // Faixa de imposto de 15%
            else if (sal > 3500 && sal <= 4500) {
                System.out.print("Seu imposto de renda é de 15%.");
            }
            // Faixa de imposto de 22,5%
            else if (sal > 4500 && sal <= 5500) {
                System.out.print("Seu imposto de renda é de 22,5%.");
            }
            // Faixa de imposto de 27,5%
            else {
                System.out.print("Seu imposto de renda é de 27,5%.");
            }
        }
        // Salários até 2500 estão isentos
        else {
            System.out.print("Você está isento do imposto de renda.");
        }

        entrada.close(); // Fecha o scanner
    }
}

