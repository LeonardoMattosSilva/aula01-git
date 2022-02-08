package application;

import java.util.Locale;
import java.util.Scanner;
import entities.salario;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		salario salario = new salario();
		
		System.out.print("Nome: ");
		salario.nome = sc.nextLine();
		
		System.out.print("Salario: ");
		salario.salario = sc.nextDouble();
		System.out.print("Imposto: ");
		salario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Salario Liquido" + salario.nome + ", " + salario.salarioLiquido());
		
		System.out.println();
		System.out.print("Percentual de aumento do salario:");
		double porcent = sc.nextDouble();
		salario.novoSalario(porcent);
		
		System.out.println();
		System.out.print("Salario atualizado" + salario);
		sc.close();
	
	}

}
