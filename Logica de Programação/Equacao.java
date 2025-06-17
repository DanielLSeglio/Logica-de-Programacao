public class Equacao {
    public static void main(String[] args) {
        // Inicializa a variável i com 2
        int i = 2;
        
        // Calcula a raiz quadrada de i usando Math.sqrt()
        double r = Math.sqrt(i);
        
        // Exibe o resultado em partes, usando print e println
        System.out.print("A raiz quadrada de ");
        System.out.print(i);
        System.out.print(" é ");
        System.out.print(r);
        System.out.println(".");

        // Atualiza i para 5 e recalcula a raiz quadrada
        i = 5;
        r = Math.sqrt(i);

        // Exibe o resultado usando concatenação direta na string
        System.out.println("A raiz quadrada de " + i + " é " + r + ".");
    }
}
