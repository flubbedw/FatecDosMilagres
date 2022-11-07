public class No {
	//armazenar inteiros
	private int info;
	//definições recursivas
	private No ant;
	private No prox;
	//construtor
	public No (int info) {
		this.info = info;
		this.ant = null;
		this.prox = null;
	}
	//métodos de acesso = getters
	public int getInfo() {
		return this.info;
	}
	public No getAnt() {
		return this.ant;
  }
	public No getProx() {
		return this.prox;
      }

 	//metodos modificadores
	public void setInfo (int info) {
		this.info = info;
	}
	public void setAnt (No ant) {
		this.ant = ant;
	}
	public void setProx (No prox) {
		this.prox = prox;
	}
	//representação textual de um nó
	//sobrescrita
	public String toString() {
		return " -- " + this.info + " -> ";
	}
}