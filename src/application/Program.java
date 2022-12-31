package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Conta;
import entitites.ContaEmpresarial;
import entitites.ContaPoupanca;
import entitites.ContaPoupancaPlus;

public class Program {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		
		
		//UPCASTING
		//Toda ContaEmpresarial � uma conta, mas nem toda Conta � uma ContaEmpresarial
		//Opera��o normal,sem precisar fazer Casting
		
		Conta conta01=new Conta(607294, "Rafael", 5000.0);
		Conta conta02=new ContaEmpresarial(584995,"Apple" , 15000.0, 50000.0);
		Conta conta03=new ContaPoupanca(6072946, "Rafael", 15000.0, 0.05);
		System.out.println(conta01);
		System.out.println();
		System.out.println(conta02);
		System.out.println();
		System.out.println(conta03);
		System.out.println();
		
		//DOWMCASTING
		//Processo inverso que n�o � natural, tem que fazer o Casting
		//Ex: Para poder usar a opera��o de emprestimo em uma vari�vel do tipo conta(qe n�o tem esse m�todo),
		//primeiro tenho que fazer o DOWMCASTING para ContaEmpresarial que tem esse m�todo.
		
		ContaEmpresarial conta04 = (ContaEmpresarial) conta02;
		conta04.emprestimo(900);
		//ContaEmpresarial conta05= (ContaEmpresarial) conta03;
		if (conta03 instanceof ContaEmpresarial) {
			ContaEmpresarial conta05=(ContaEmpresarial)conta03;
			conta05.emprestimo(2500);
			System.out.println("Foi feito um empr�stimo de R$ 2.5000 na conta05, pois ele � uma conta empresarial");
			System.out.println(conta05);
		}	
		if (conta03 instanceof ContaPoupanca) {
			ContaPoupanca conta05=(ContaPoupanca)conta03;
			conta05.saldoAtualizado();
			System.out.println("Recebeu juros de poupan�a e um saque de R$ 730.00, pois a conta05 � do tipo conta poupan�a");
			conta05.saque(730);
			System.out.println(conta05);
		}
		
		
		System.out.println();
		
	
		if(conta02 instanceof ContaEmpresarial) {
			ContaEmpresarial conta06=(ContaEmpresarial)conta02;
			conta06.emprestimo(2500);
			System.out.println("Foi feito um empr�stimo de R$ 2.500 na conta06, pois ele � uma conta empresarial");
			System.out.println(conta06);
			
		}
		if(conta02 instanceof ContaPoupanca) {
			ContaPoupanca conta06=(ContaPoupanca)conta02;
			System.out.println("Recebeu juros de poupan�a, pois a conta06 � do tipo conta poupan�a");
			System.out.println(conta06);
		}
			
		System.out.println();
		System.out.println("Dados atualizados");
		System.out.println("A Conta04 � os dados da conta02 com um empr�stimo de R$ 900,00 e taxa de emprestimo de R$ 10,00");
		System.out.println(conta04);
		System.out.println();
		
		System.out.println("Contapoupanca n�o tem taxa para saque, conta normal tem taxa de R$ 15,00");
		System.out.println("conta01 tem saque de 500 � com taxa, conta07(tipo poucan�a) tem saque de 500 e sem taxa");
		conta01.saque(500);
		ContaPoupanca conta07=new ContaPoupanca(159945, "Juliana", 5000.0, 0.0);
		conta07.saque(500);
		System.out.printf("Saldo da conta 01: R$ %.2f\n",conta01.getSaldo());
		System.out.printf("Saldo da conta 07: R$ %.2f\n",conta07.getSaldo());
		System.out.println("Dados da conta07: "+conta07);
		
		
		//para conta empresarial al�m de taxa de 15, tem uma taxa adicional de 8 no saque, total de 23
		ContaEmpresarial conta08= new ContaEmpresarial(599966, "Lucr�cia", 5523.0, 10000.0);
		
		
		System.out.println("Saldo da conta08: "+conta08.getSaldo());
		System.out.println("Dados da conta08: "+ conta08);
		conta08.saque(500);
		System.out.println("Saldo da conta08, ap�s o saque de R$500,00 (com taxas(R$15,00 da conta normal e mais R$8,00 por ser conta emrpesarial): "+conta08.getSaldo());
		
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		//POLIMORFIMOS (muitas formas, comportamentos diferentes conforme os objetos que eles apontam)
		System.out.println("POLIMORFISMO");
		Conta conta09=new Conta(90548, "BATMAN", 50000.0);
		ContaPoupanca conta10= new ContaPoupanca(549909, "ROBIN", 50000.0, 0.08);
		System.out.println("conta09 e conta10, sofrem um saque de R$ 1.000, mas com taxas diferentes");
		conta09.saque(1000);
		
		conta10.saldoAtualizado();
		conta10.saque(1000);
		
		System.out.println("A conta09 e conta10 tiveram o mesmo saldo inicial e o mesmo valor sacado.\n"
				+ "Entranto tem um saldo final diferente, devido ao POLIMORFISMO. Apesar de ambas serem objetivos do tipo conta,\n"
				+ "uma � foi instanciada como Conta Poupan�a onde o m�todo sobrescrito tem saque n�o tem taxa e ainda tem os juros de poupan�a.");
		System.out.println("No caso de um Upcasting a associa��o do tipo espef�cio com o tipo gen�rico � feito em tempo de execu��o.");
		System.out.println("Saldo da conta09: R$"+conta09.getSaldo());
		System.out.println("Saldo da conta10: R$"+conta10.getSaldo());
		System.out.println("conta09 - "+conta09);
		System.out.println("conta10 - "+conta10);
		
		ContaPoupancaPlus contaPlus = new ContaPoupancaPlus(45900,"Claudia da Silva",1000.0,0.05);
		contaPlus.saque(900);
		System.out.println(contaPlus);
		
		
		
		
		
		sc.close();	
	}

}
