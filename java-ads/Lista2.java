public class Lista2 {
	private No primeiro; //esta informacão é a referencia do primeiro nó
	//o contrutor é o padrão, por clareza, vqmos escreve-lo	
	public Lista2() {
		this.primeiro = null;		
	}
	//metodos de acesso e modificadores
	public No getPrimeiro() {
		return this.primeiro;
	}
	public void setPrimeiro (No primeiro) {
		this.primeiro = primeiro;
	}
	//representação textual
	public String toString() {
		String s = "Lista: ";
		if (this.estaVazia()) {
			s = s + "esta vazia";
		}
		else {//percorrer a lista e montar a String
			No aux = this.primeiro;
			while (aux != null) {
				s = s + aux; //é invocado automaticamente o método toString do nó
				aux = aux.getProx();
			}
		}
		return s;
	}

	//metodos especificos: os que permitem a manipulacao da lista
	public boolean estaVazia() {
		if (this.primeiro == null)
			return true;
		else
			return false;
	}
	public void insereInicio(int i) {
		No novo = new No(i);
		if (!this.estaVazia()) {
			novo.setProx(this.primeiro);
			this.primeiro.setAnt(novo);
		}
		this.primeiro = novo;
	}
	public int removeInicio() {
		//segura o elemento que está na primeira posição
		int aux = this.primeiro.getInfo();
		//acerta as ligações
		this.primeiro = this.primeiro.getProx();
		this.primeiro.setAnt(null);
		return aux;
	}
	
}