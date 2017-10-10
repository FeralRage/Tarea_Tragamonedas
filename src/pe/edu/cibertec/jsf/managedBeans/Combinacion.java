package pe.edu.cibertec.jsf.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="combi")
@SessionScoped
public class Combinacion {
	
	private int num1=0;
	private int num2=0;
	private int num3=0;
	private int counter=10;
	private String mensaje;
	
	public String jugar (){
		num1 = (int)(Math.random()*3)+1;
		num2 = (int)(Math.random()*3)+1;
		num3 = (int)(Math.random()*3)+1;
		counter--;
		
		if (counter < 0){
			mensaje = "Creditos agotados (requiere mas dinero)";
			reset();
			return "resultado";
		}
		
		if (num1==num2 && num2==num3){
			mensaje = "Usted ha obtenido una VICTORIA MORAL";
			reset();
			return "resultado";
		}

		return "tragamonedas";
	}
	
	public void reset(){
		num1=0;
		num2=0;
		num3=0;
		counter=10;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
