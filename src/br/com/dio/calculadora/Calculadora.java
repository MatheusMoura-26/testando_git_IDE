package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Digite o primeiro valor:");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		b = sc.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double divisao = divisao(a,b);
		double multiplicacao = multiplicacao(a,b);
		 
		 System.out.println("SOMA: "+soma);
		 System.out.println("SUB: "+subtracao);
		 System.out.println("DIV"+ divisao);
		 System.out.println("MULTI: "+multiplicacao);
		
	}

	public static double soma(double a, double b) {
		return a + b;
	}
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
}
