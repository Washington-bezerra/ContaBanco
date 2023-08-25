import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Numero da conta: ");
        int conta = terminal.nextInt();

        terminal.nextLine();

        System.out.println("Numero da agencia: ");
        String agencia = terminal.nextLine();

        System.out.println("Nome do cliente: ");
        String nomeCliente = terminal.nextLine();

        System.out.println("saldo: ");
        double saldo = terminal.nextDouble();

        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque"
        );

    }
}