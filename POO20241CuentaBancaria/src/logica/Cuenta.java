package logica;

public class Cuenta {
	private int numero;
	private int saldo;
	private String tipo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Cuenta(int numero, int saldo, String tipo) {
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
	public void consignar(int valor) {
		this.saldo += valor;
	}
	
	public boolean retirar(int valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
}
