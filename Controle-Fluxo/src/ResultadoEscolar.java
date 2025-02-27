public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota =7;

        System.out.println("Nota a ser calculada: " + nota);

        if(nota >= 7) {
            System.out.println("Aprovado");
        }else if(nota >= 5) {
            System.out.println("Recuperação");
        }        
        else {
            System.out.println("Reprovado");
        }


        int notam = 9;
        String rs;
        System.out.println("Nota de Matemática: " + notam);

        rs = notam >= 7 ? "Aprovado" : notam >= 5 ? "Recuperação" : "Reprovado";
        System.out.println(rs);

        int notaf = 5;
        System.out.println("Nota de Física " + notaf);

        switch (notaf) {
            case 7:
                System.out.println("Aprovado");                
                break;

            case 5:
                System.out.println("Recuperação");
                break;

                case 0:
                System.out.println("Recuperação");
        
            default:
                   System.out.println("Recuperação");
                break;
        }
    }
    
}

