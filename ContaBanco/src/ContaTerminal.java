import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " +  nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
