public class PilhaEstatica {
	private int topo=0;
	private int[] dados;
	
	//sobrecarga de método
	public PilhaEstatica() {
		this.dados = new int[10];
	}
	
	public PilhaEstatica (int capacidade) {
		this.dados = new int[capacidade];
	}
	public boolean estaVazia() {
		return this.topo == 0;
	}
	public boolean estaCheia() {
		return this.topo == this.dados.length;
	}
	//inserção de elementos = empilhamento = push
	public void push (int i) {
		this.dados[this.topo++] = i;
	} 
	//remoção (lógica) de elementos = desempilhamento = pop
	public int pop () {
		return this.dados[--this.topo];
	}
	//consulta topo
	public int peek() {
		return this.dados[this.topo - 1];
	}
	@Override
	public String toString () {
		String s = "pilha: ";
		if (this.estaVazia())
			s = s + "esta vazia";
		else
			for (int i=this.topo-1; i>=0; i--)
				s = s + this.dados[i] + " ";
		return s + "\n";
	} 
	public int	busca(int e) {
		for (int i=0; i<this.topo; i++)
			if (this.dados[i] == e)
				return i;
		return -1;
	}
}