public class Aula011 {
    public static void main(String[] args) {
        int salario = 5500;
        float porcent5 = 5;
        float porcent10 = 10;
        float porcent15 = 15;
        float porcent20 = 20;
        if(salario < 1000){
            System.out.println((salario * porcent5) / 100);
        } else if(salario >= 1000 || salario < 2000){
            System.out.println((salario * porcent10) / 100);
        } else if(salario >= 2000 || salario < 4000){
            System.out.println((salario * porcent15) /100);
        } else if(salario > 5000){
            System.out.println((salario * porcent20) / 100);
        }
    }
}
