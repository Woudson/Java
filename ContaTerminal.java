import java.util.Scanner;   

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);

        System.out.println("Por favor, digite o numero da conta");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da agencia");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        scanner.close();

        String Mensagem = "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque.");


        System.out.println(Mensagem);

    }
}