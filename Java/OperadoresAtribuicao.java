public class OperadoresAtribuicao {
    public static void main(String[] args) {
        //String[] args é um conjunto de strings
        //System.out.println("Olá, " + args[0] + " " + args[1]);

        OperadoresAtribuicao acessa = new OperadoresAtribuicao();
        acessa.imprime();

        int num = 4;
        int outrNum = num;
        num = num + 5;
        System.out.println(outrNum);
        System.out.println(num);
    }

    public void imprime(){
        String cidade = "Cedro";
        System.out.println(cidade);
    }
}
