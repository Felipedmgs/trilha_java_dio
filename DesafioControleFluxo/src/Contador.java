
    import java.util.Scanner;

    public class Contador {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicita os dois números ao usuário
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
    
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
    
            try {
                contar(numero1, numero2);
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
            }
    
            scanner.close();
        }
    
        public static void contar(int num1, int num2) throws ParametrosInvalidosException {
            if (num1 > num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }
    
            int quantidade = num2 - num1;
            for (int i = 1; i <= quantidade; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
    
    


