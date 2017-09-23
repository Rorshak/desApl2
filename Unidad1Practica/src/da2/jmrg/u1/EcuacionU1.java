package da2.jmrg.u1;

import java.io.Serializable;

public class EcuacionU1 implements Serializable{
	private int valor1;
	private int valor2;
	
	
	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	public double getResult() {
		return (valor2*(Math.pow(valor1, 2)))*((Math.pow(valor1, 3))+(5*(valor1*valor2))-(Math.pow(valor2,3)))
				+((2*(valor1*valor2))*((Math.pow(valor1, 4))-(2*((Math.pow(valor1,2))*valor2))+((Math.pow(valor2, 3))*valor1)));
		
			
	}
	
	
	
	
}
