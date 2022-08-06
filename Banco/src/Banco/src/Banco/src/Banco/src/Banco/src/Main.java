import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
	private static Scanner ler = new Scanner(System.in);
	static String nome;
	static Conta cc;
	static Conta poupanca;
	 public static void main(String[] args) {

		System.out.println("###### Banco ######");
		System.out.println("###### Digite o nome do titular da conta! ######");
		nome = ler.nextLine();
		Cliente cliente = new Cliente();
	  	cliente.setNome(nome);

		cc = new ContaCorrente(cliente);
		poupanca = new ContaPoupanca(cliente);
		System.out.println();
		opcao();

    }
}

	private static void opcao(){
		System.out.println("###### Digite o digito da opção que deseja realizar!######");
		System.out.println("1. Para realizar um Deposito");
		System.out.println("2. Para realizar uma transferencia");
		System.out.println("3. Para imprimir um extrato da conta corrente");
		System.out.println("4. Para imprimir um extrato da conta poupança");
		System.out.println("5. Finalizar operações!");
		int operacao = ler.nextInt();

		if(operacao == 1){
			deposito();

		}else if(operacao == 2){
			transferencia();

		}else if(operacao == 3){
			extratoCorrente();
		}
		else if(operacao == 4){
			extratoPoupanca();
		}else if(operacao == 5){
			System.out.println("Operação encerrada!");
		}
		else{
			System.out.println("Operação Invalida! Digite '1' ou '2' para realizar uma operação!");
			opcao();
		}

	}

    private static void deposito() {
        System.out.print("1 - Digite o valor que deseja depositar: ");
        double valorDeposito = ler.nextDouble();
		cc.depositar(valorDeposito);
		System.out.println();
		opcao();
    }

    private static void transferencia() {
        System.out.print("2 - Digite o valor que deseja transferir: ");
        double valorTransferencia = ler.nextDouble();
		cc.transferir(valorTransferencia, poupanca);
		System.out.println();
		opcao();
    }

    private static void extratoCorrente() {
		cc.imprimirExtrato();
		System.out.println();
		opcao();

    }
	private static void extratoPoupanca() {
		poupanca.imprimirExtrato();
		System.out.println();
		opcao();
    } 


} 
