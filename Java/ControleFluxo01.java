public class ControleFluxo01 {
    public static void main(String[] args) {
        float salario = 900;
        float imposto = 0;

        if(salario < 1000){
            imposto = (salario * 5) / 100;
        } else if(salario >= 1000 && salario < 2000){
            imposto = (salario * 10) / 100;
        } else if(salario >= 2000 && salario < 4000){
            imposto = (salario * 15) /100;
        } else if(salario > 5000){
            imposto = (salario * 20) / 100;
        } else{
            System.out.println("[ERRO]");
        }
        System.out.println("O imposto é de: " + imposto);
    }
}
