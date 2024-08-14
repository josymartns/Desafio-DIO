package DesafioDIO;

public class Main {
	public static void main(String[] args) {
		Cliente josy = new Cliente();
		josy.setNome("Josy");
		
		Conta cc = new ContaCorrente(josy);		
		Conta cp = new ContaPoupanca(josy);
		
		cc.transferir(50, cp);
		cc.depositar(100);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
