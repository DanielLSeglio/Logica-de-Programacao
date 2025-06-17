import java.util.Scanner;

public class Venda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double venda, desc, val_final;

        System.out.print("Digite o valor da venda: ");
        venda = entrada.nextDouble();

        if (venda >= 300) {
            System.out.print("Digite o valor do descont: ");
            desc = entrada.nextDouble();

            val_final = venda - (venda  * (desc/100));
            System.out.println("O valor final de sua compra é de R$" + val_final);
        }

        else {
        System.out.println("O valor final de sua compra é de R$" + venda);
        }
        
        entrada.close();
 }
}
