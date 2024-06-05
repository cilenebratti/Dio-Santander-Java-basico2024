import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Conhecer e importar classe scanner:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para usuários:
        System.out.println("Digite seu Nome: ");
        // obtendo pela classe scanner os valores digitados no terminal:
        String nomeCliente = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite o número da sua Conta Corrente sem o digito: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da sua Agência com o digito: ");
        String agencia = scanner.next();

        double saldo = 12361.29; // não quis deixar o usuário entrar com o valor do saldo. 

        //imprimindo a mensagem com a concatenação dos valores recebidos pelo terminal:
        System.out.println("   ");
        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + ", seja bem vindo ao Banco Bratti;");
        System.out.println("O número de sua Agência é: " + agencia + ", e sua Conta corrente é: " + conta + ";");
        System.out.println("Seu Saldo Atual é de: R$  " + saldo + "   diponível para saque imediato!");
        System.out.println("   ");
    }
}
