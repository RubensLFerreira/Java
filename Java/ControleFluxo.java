public class ControleFluxo {
    public static void main(String[] args) {
        int idade = 30;
        String categoria = "";
        if(idade < 15){
            categoria = "infántil";
        } else if(idade >= 15 && idade < 18){
            categoria = "juvenil";
        } else if(idade >= 18 && idade < 25){
            categoria = "adulto";
        } else {
            System.out.println("Informe uma idade");
        }
        System.out.println(categoria);
    }
}
