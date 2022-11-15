package entitites;

public class ContaEmpresarial extends Conta{
	//ContaEmprsarial é um subclasse / especialização / extensão de Conta
	private Double LimiteDeEmprestimo;
	
public	ContaEmpresarial() {
	super();
}

public ContaEmpresarial(Integer numeroDaConta, String correntista, Double saldo, Double limiteDeEmprestimo) {
	super(numeroDaConta, correntista, saldo);
	LimiteDeEmprestimo = limiteDeEmprestimo;
}



public Double getLimiteDeEmprestimo() {
	return LimiteDeEmprestimo;
}

public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
	this.LimiteDeEmprestimo = limiteDeEmprestimo;
}
//taxa de R$ 10.0 para emprestar
public void emprestimo(double valor) {
	if(valor<=LimiteDeEmprestimo) {
		saldo+=valor-10.0;
	}
	
}
@Override
public void saque(double valor) {
	super.saque(valor);
	saldo=saldo-8.0;
}

@Override
public String toString() {
	return "Dados da ContaEmpresarial [numeroDaConta=" + numeroDaConta + ", correntista=" + correntista + ", LimiteDeEmprestimo=" + String.format("R$%.2f",getLimiteDeEmprestimo()) + ", saldo=" + String.format("R$%.2f",saldo) + "]";
}



}
