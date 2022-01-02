public class ControleFluxo04 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador++);
        }
        contador = 0;
        do {
            System.out.println("Dentro do Do while " + contador++);
        } while (contador < 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println("O valor de i é :" + i);
            if (i == 5) {
                break;
            }
        }
    }
}
