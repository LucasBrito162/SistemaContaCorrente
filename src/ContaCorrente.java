import java.util.Scanner;

public class ContaCorrente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroCliente cadastro = new CadastroCliente();
        cadastro.cadastrar();
        System.out.println("""
                            BEM VINDO AO MELHOR BANCO!
                                FIQUE A VONTADE
                SIGUA-ME NO LINKEDIN: https://www.linkedin.com/in/lucasdebritonunes
                """);

       
        System.out.println("***************************************");
        System.out.println("\nNome:                   " + cadastro.getNome());
        System.out.println("Tipo da conta:          " + cadastro.getTipoDeConta());
        System.out.println("Saldo inicial:          " + cadastro.getSaldo());
        System.out.println("\n***************************************");
        System.out.println("""
                

                """);
        System.out.println("                    OPERAÇÕES");
        System.out.println("""
                
                """);

        for (int operacao = 0; operacao != 4;){
            System.out.println("\n Digite uma opção:    ");
            System.out.println("\n 1- SALDO NA CONTA");
            System.out.println("\n 2- RECEBER UM PAGAMENTO");
            System.out.println("\n 3- TRANSFERÊNCIA \n");
            System.out.println("\n 4- SAIR");


            
            operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("\nSeu saldo é:  " + cadastro.getSaldo());
                    break;
                case 2:
                    System.out.println("\nValor a receber:  ");
                    double receber = sc.nextDouble();
                   cadastro.setSaldo(cadastro.getSaldo() + receber);
                    System.out.println("\nValor recebido com sucesso!  ");
                    break;
                case 3:
                    System.out.println("\nQuanto quer transferir:");
                    double transferir = sc.nextDouble();
                    if (cadastro.getSaldo() >= transferir) {
                    cadastro.setSaldo(cadastro.getSaldo() - transferir);
                        System.out.println("\nTransferência realizada com sucesso!");
                    } else {
                        System.out.println("\nSaldo insuficiente para realizar a transferência.");
                    }
                    break;
                case 4:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }
    }

}