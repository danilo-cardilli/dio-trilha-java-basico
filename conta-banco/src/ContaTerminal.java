import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuario
        System.out.println("Por favor, digite o número da Agência!\n");
        System.out.print("Usuario:");        
        int numero = scanner.nextInt();
        //System.out.println("Número da Agência digitado foi: " + numero);


        System.out.println("\nDigite o código da Agência!\n");
        System.out.print("Agência:");
        String agencia = scanner.next();
        //System.out.println("O código da Agência digitado foi: " + agencia);

        System.out.println("\nDigite o nome do cliente\n");
        System.out.print("Nome:");
        String nomeCliente = scanner.next();
        //System.out.println("O nome do cliente digitado foi: " + nomeCliente);

        System.out.println("\nDigite o saldo do cliente\n");
        System.out.print("Saldo:");
        Double saldo = scanner.nextDouble();
        //System.out.println("O saldo do cliente digitado foi: " + saldo);







        // Exibir a mensagem conta criada

        System.out.println("\nOlá ["+ nomeCliente +"], obrigado por criar uma conta em nosso banco, sua agência é ["+ agencia +"], conta ["+ numero +"] e seu saldo ["+ saldo +"] já está disponível para saque");
    }
}
