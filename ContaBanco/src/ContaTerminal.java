import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = String.format("Olá %s, obrigado(a) por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

    }
}