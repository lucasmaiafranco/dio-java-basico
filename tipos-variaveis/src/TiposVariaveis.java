public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Variáveis podem mudar de valor
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // Constantes
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 12.2; -> Contantes não podem mudar
        System.out.println(VALOR_DE_PI);

    }
}
