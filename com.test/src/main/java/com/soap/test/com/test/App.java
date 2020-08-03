package com.soap.test.com.test;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Endpoint.publish("http://localhost:1515/WS/Calculadora", new CalculadoraImpl());
    }
}
