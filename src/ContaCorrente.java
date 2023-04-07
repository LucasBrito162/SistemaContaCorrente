import java.util.Scanner;

public class ContaCorrente {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Lucas de Brito Nunes";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        
       
    System.out.println("***************************************");
    System.out.println("\nNome:                   " + nome);
    System.out.println("Tipo da conta:          " + tipoConta);
    System.out.println("Saldo inicial:          " + saldoInicial);
    System.out.println("\n***************************************");
    System.out.println();
    System.out.println();
    System.out.println("                    OPERAÇÕES");
    System.out.println();
        
        


    for (int operacao = 0; operacao != 4;){

    System.out.println("\n Digite uma opção:    "); 
    System.out.println("\n 1- SALDO NA CONTA");
    System.out.println("\n 2- RECEBER UM PAGAMENTO");
    System.out.println("\n 3- TRANSFERÊNCIA \n");
    





     operacao = sc.nextInt();

    switch (operacao) {
        case 1:
            System.out.println("\nSeu saldo é:  " + saldoInicial);
            break;
        case 2:
            System.out.println("\nValor a receber:  ");
            double receber = sc.nextDouble();
            saldoInicial += receber;
            System.out.println("\nValor recebido com sucesso!  ");
            break;
        case 3:       
        System.out.println("\nQuanto quer transferir:");
        double transferir = sc.nextDouble();
        if (saldoInicial >= transferir) {
            saldoInicial -= transferir;
            System.out.println("\nTransferência realizada com sucesso!");
        } else {
            System.out.println("\nSaldo insuficiente para realizar a transferência.");
        }
        break;
    default:
        System.out.println("\nOpção inválida!");
        break;
    }


     
    }
}

     
}

    

    






    
    

