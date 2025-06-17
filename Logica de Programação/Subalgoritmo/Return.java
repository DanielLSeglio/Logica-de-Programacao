public class Return {
    public static void main(String[] args) {
        double r = 5, a; // Declara o raio (r) e a variável para a área (a)

        // Calcula a área do círculo usando a fórmula: área = pi * raio^2
        a = pi() * (r * r);

        // Exibe o resultado
        System.out.println("A área do círculo com raio " + r + " é " + a);
    }

    // Método que retorna o valor de pi
    public static double pi() {
        return 3.14; // Retorna o valor de pi
    }
}