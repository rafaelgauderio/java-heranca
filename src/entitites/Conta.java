package entitites;
//ContaPF é uma superclase / generalização
public class Conta {
	protected Integer numeroDaConta;
	protected String correntista;
	protected Double saldo;

	public Conta() {

	}

	public Conta(Integer numeroDaConta, String correntista, Double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.correntista = correntista;
		this.saldo = saldo;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public Double getSaldo() {
		return saldo;
	}
/*
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
*/
	
//métodos
	
	public void saque(double valor) {
		//15,00 a taxa de saque
		saldo-=valor+15;
		//saldo=saldo+valor
	}
	public void deposito(double valor) {
		saldo+=valor;
	}

	@Override
	public String toString() {
		return "Dados da Conta [numeroDaConta=" + numeroDaConta + ", correntista=" + correntista + ", saldo=" +String.format("R$%.2f",saldo)+"]";
	}
	
	
}

	

