import java.util.Scanner;

public class CadastroCliente {

    private String nome;
    private String cpf;
    private String tipoDeConta;
    private Double saldo;

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = sc.nextLine();

        System.out.print("Digite o tipo de conta: ");
        tipoDeConta = sc.nextLine();

        System.out.print("Digite o valor inicial: ");
        saldo = sc.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}