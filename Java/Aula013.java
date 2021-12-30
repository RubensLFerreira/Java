public class Aula013 {
    public static void main(String[] args) {
        byte semana = 7;
        byte semanaDia = 7;

        switch (semana) {
            case 1:
                System.out.println("Domingo, final de semana.");
                break;
            case 2:
                System.out.println("Segunda, final de semana.");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("[ERRO]");

                switch (semanaDia) {
                    case 1:
                    case 7:
                        System.out.println("Final de semana");
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        System.out.println("Dia útil");
                        break;
                    default:
                        System.out.println("[ERRO]");
                        break;
                }
        }
    }
}

