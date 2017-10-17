package com.automation.training;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea1 {

  
	  @Test(dataProvider = "num",groups={"Smoke","regression"})
	    public void test1( Integer num1, Integer num2 ) {
	     
	     int result = (num1 * num2);
	     //int expResult = 12;
	     //assertEquals(result, expResult);
	    	System.out.println("Test1 multiplica dos numeros "+num1+" x "+num2+" = "+result);	
	    }
	 
	    @DataProvider(name = "num")
	    private Object [][] loadintegers() { 
	        return new Object[][]{
	        	{new Integer(1), new Integer(2)},
	        	{new Integer(3), new Integer(4)},
	        	{new Integer(4), new Integer(5)}
	        	}; }
	    
	  
  
	    @Test(dataProvider = "cadenas",groups={"Smoke","regression"})
	    public void test2( String a, String b, String c ) {
	    	String resultado = a + b + c;	
	    //	String expResult = "Cesar Ruedas Quintana";
	    //	assertEquals(resultado, expResult);
	    	System.out.println("Test2 concatena 3 palabras "+a+" "+b+" "+c+ " = "+resultado);	
	    }
	    
	    @DataProvider(name = "cadenas")
	    private Object [] [] loadwords() { 
	        return new Object[][]{
	        	{ new String("Cesar "), new String("Ruedas "), new String("Quintana") },
	        	{ new String("Cesar2 "), new String("Ruedas2 "), new String("Quintana2") },
	        	{ new String("Cesar3 "), new String("Ruedas3 "), new String("Quintana3") },
	        	{ new String("Cesar4 "), new String("Ruedas4 "), new String("Quintana4") }
	        };
	    }
	            
	    

	    @Test(groups = {"Smoke"}) 
	    @Parameters({"Fecha"})
        public void test3(String f) {
	    	String fechas = f ;
         System.out.println("Test3 generar una fecha en formato AAAA/MM/DD: "+fechas);   
}
  
    
  @Test(groups = {"Smoke"}) 
    public void test4() throws IOException{
	  System.out.println("Test4");
	  System.out.println("Por favor ingrese el vamor AMBIENTE1 para multiplicar o AMBIENTE2 para restar");
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  String entrada = br.readLine();
		  if(entrada.equals("AMBIENTE1")){	  
		  System.out.println("El valor ingresado fue AMBIENTE1 se realizar una multiplicacion");
		  System.out.print("Ingrese el numero 1 ");
		  String entrada2 = br.readLine();
		  int numero1 = Integer.parseInt(entrada2);
		  System.out.print("Ingrese el numero 2 ");
		  String entrada3 = br.readLine();
		  int numero2 = Integer.parseInt(entrada3);
		  System.out.println("Resultado es = "+numero1 * numero2);
	  }	 
		  else  if(entrada.equals("AMBIENTE2")){  
		  System.out.println("El valor ingresado fue AMBIENTE2 se realizar una resta");
		  System.out.print("Ingrese el numero 1 ");
		  String entrada3 = br.readLine();
		  int numero3 = Integer.parseInt(entrada3);
		  System.out.print("Ingrese el numero 2 ");
		  String entrada4 = br.readLine();
		  int numero4 = Integer.parseInt(entrada4);
		  System.out.println("Resultado es = "+ (numero3 - numero4));
	  }
		  else {
		        System.out.println("Ingrese un valor correcto!");
		    }
		  
}

}
