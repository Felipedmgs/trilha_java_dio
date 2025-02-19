
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {    
    public static void main(String[] args) throws Exception {               
        //os argumentos começam com indice o
        /* 
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        double altura = Double.valueOf(args[2]);
        
        System.out.println("Ola, me chamo " + nome + " tenho " + idade + " anos e " + altura + " de altura.");
        */

        //scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " tenho " + idade + " anos e " + altura + " de altura.");felip
    }
}
