import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NotificacaoFactory factory = null;

        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Push");
        System.out.println("4 - Whatsapp");


        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                factory = new EmailFactory();
                break;
            case 2:
                factory = new SMSFactory();
                break;
            case 3:
                factory = new PushFactory();
                break;
            case 4:
                factory = new PushFactory();
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        Notificacao notificacao = factory.criarNotificacao();
        notificacao.enviar("Olá, cliente!");

        scanner.close();
    }
}