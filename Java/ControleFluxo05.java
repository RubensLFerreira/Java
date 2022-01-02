public class ControleFluxo05 {
    public static void main(String[] args) {
        int valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            float valorParcela = valorTotal / parcela;

            if (valorParcela >= 1000) {
                System.out.println("Numero de parcelas: " + parcela + ", valor parcela R$ " + valorParcela);
            } else {
                break;
            }
        }
    }
}
