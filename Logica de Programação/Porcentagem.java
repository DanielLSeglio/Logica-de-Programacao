import java.util.Scanner;

public class Porcentagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, porcen, percen, acres, desc;
        
        System.out.print("Digite um valor: ");
        valor = entrada.nextDouble();

        System.out.print("Digite a porcentagem: ");
        porcen = entrada.nextDouble();

        percen = valor * (porcen/100);
        System.out.println("O valor percentual é: " + percen);

        acres = valor + percen;
        System.out.println("O valor com acrescimo é: " + acres);

        desc = valor - percen;
        System.out.println("O valor com desconto é: " + desc);

        entrada.close();

    }
    
}
