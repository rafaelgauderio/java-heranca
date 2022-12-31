package entitites;

public class ContaPoupancaPlus extends ContaPoupanca {
	
	
	public ContaPoupancaPlus(Integer numeroDaConta, String correntista, Double saldo, Double taxaDePoupanca) {
		super(numeroDaConta, correntista, saldo, taxaDePoupanca);
		
	}
	
	@Override
	public void saque (double valor) {
		super.saque(valor); // desconto o valor da conta poupança que é zero e mais 15 depois
		saldo -= 15;
	}
	
	/* Não tem com sobrescrever o métdo, pois tem a palavra final do método da superclasse
	@Override
	public void saldoAtualizado() {
		saldo += saldo *gettaxaDePoupanca();
	}
	*/
	
	@Override
	public String toString() {
		return "\nDados da ContaPoupancaPlus [numeroDaConta=" + numeroDaConta + ", correntista=" + correntista + ", taxaDePoupanca=" + String.format("%.2f",taxaDePoupanca)+ ", saldo=" + String.format("R$%.2f", saldo) + "]";
	}

}
