package presentacion;

import logica.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Cuenta c1;
		c1 = new Cuenta(1, 1000, "Ahorros");
		c1.consignar(5000);
		System.out.println(c1.getSaldo());
		if(c1.retirar(4000)) {
			System.out.println(c1.getSaldo());
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		
		
	}
}
