package entities;

public class salario {
	public double salario;
	public double imposto;
	public String nome;
	
	public double salarioLiquido(){
		return salario - imposto;
	}
	
	public void novoSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString() { 
		return nome + ", $" + salario;
	}

}
