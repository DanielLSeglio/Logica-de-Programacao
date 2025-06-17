import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sal, aumento, novo_sal;
        int tc;

        System.out.println("Digite seu salario atual: ");
        sal = entrada.nextDouble();

        System.out.println("Digite a quantidade de anos na empresa: ");
        tc = entrada.nextInt();

        if (tc < 3) {
            aumento = sal * (5.0/100);
        }

        else {
            aumento = sal * (10.0/100);
        }

        novo_sal = sal + aumento;
        System.out.println("Seu novo salario é de R$" + novo_sal);

        entrada.close();
    }
}
