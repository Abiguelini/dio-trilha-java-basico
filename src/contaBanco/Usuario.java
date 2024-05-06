package contaBanco;

public class Usuario {
	
	 int conta;
	 String agencia;
	 String nomeUsuario;
	 double saldo;
	public Usuario(int conta, String agencia, String nomeUsuario, double saldo) {
		super();
		this.conta = conta;
		this.agencia = agencia;
		this.nomeUsuario = nomeUsuario;
		this.saldo = saldo;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 
	 
}
