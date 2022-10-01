public class Pilhas {
    
    private int topo;
    private int[] dados;
    public Pilhas (int capacidade) {
        this.topo=0;
        this.dados = new int[capacidade];
    }
    public boolean estaVazia () {
        return this.topo == 0;
    }
    public boolean estaCheia () {
        return this.topo == dados.length;
    }
    public void push (int novo) {
        this.dados[this.topo++] = novo;
    }
    public int pop () {
        return this.dados[--this.topo];
    }
    public int elementoTopo(){ 
        return this.dados[this.topo-1];
    }
    public int tamanhoPilha(){
        return this.elementoTopo();
    }
    @Override
    public String toString () {
        String s = "pilha: ";
        if (this.estaVazia()) {
            s = s + "esta vazia";
        }
        else {
            for (int i=this.topo-1; i>=0; i--) {
                s = s + this.dados[i] + " ";
            }
        }
        s = s + "\n";
        return s;
    }

}