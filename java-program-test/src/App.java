public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int soma = 0;
        for(int i : lista) {
            soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
