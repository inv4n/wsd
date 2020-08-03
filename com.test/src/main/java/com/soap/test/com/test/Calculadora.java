package com.soap.test.com.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculadora {
	
	@WebMethod
	public double calcular(int opcion, int valor1, int valor2);
}
