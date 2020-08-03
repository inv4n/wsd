package com.soap.test.com.test;

import javax.jws.WebService;

@WebService(endpointInterface="com.soap.test.com.test.Calculadora")
public class CalculadoraImpl implements Calculadora{

	public double calcular(int opcion, int valor1, int valor2) {
		double valor=0;
		switch(opcion) {
		case 1:
			valor = valor1+valor2;
			break;
		case 2:
			valor = valor1-valor2;
			break;
		case 3:
			valor = valor1*valor2;
			break;
		case 4:
			valor = valor1/valor2;
			break;
			
		}
		return valor;
	}
}
