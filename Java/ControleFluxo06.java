public class ControleFluxo06 {
    public static void main(String[] args) {
        float valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            float valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Numero de parcelas: " + parcela + ", valor parcela R$ " + valorParcela);
        }
    }
}
/*
Para evitar disperdicio de memória, usamos o valor invertido, ou seja,
começamos de R$ 30.000 até seu menor valor divido
pela parcela menor que R$ 1.000

Se o valor da parcela for menor que R$ 1.000 a instrução
continue diz que ele deve voltar pro for e contar mais uma parcela
*/
