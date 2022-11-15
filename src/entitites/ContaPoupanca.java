package entitites;

//final da frete da classe evita que a classe seja herdada e evita que o m�todo seja sobreposto
public final class ContaPoupanca extends Conta{
	private Double taxaDePoupanca;

public ContaPoupanca() {
	super();
}

public ContaPoupanca(Integer numeroDaConta, String correntista, Double saldo, Double taxaDePoupanca) {
	super(numeroDaConta, correntista, saldo);
	this.taxaDePoupanca = taxaDePoupanca;
}

public Double gettaxaDePoupanca() {
	return taxaDePoupanca;
}
public void setTaxaDePoupanca(Double taxaDePoupanca) {
	this.taxaDePoupanca=taxaDePoupanca;
}

public void saldoAtualizado() {
	saldo+=saldo*taxaDePoupanca;
	//saldo=saldo+saldo*taxaDePoupanca;
}

//sobreposi��o
//Implementar um m�doto da superclasse na subclasse
//usar@Override em m�todos sobrepostos para informar o compilador que � sobreposi��o

@Override
public void saque(double valor) {
	saldo-=valor;
}

@Override
public String toString() {
	return "Dados da ContaPoupanca [numeroDaConta=" + numeroDaConta + ", correntista=" + correntista + ", taxaDePoupanca=" + String.format("%.2f",taxaDePoupanca)+ ", saldo=" + String.format("R$%.2f", saldo) + "]";
}





}
