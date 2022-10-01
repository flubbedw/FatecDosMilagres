public class ExerciciosPilha {

    //Um método que somente empilha valores menores sobre maiores
    //exemplo válido: 2 - 4 - 7 - 9
    //exemplo não válido: 2 - 4 - 9 - 7


    boolean empilhaHanoi (int i, Pilhas p) {
        if (p.estaCheia())
            return false;
        Pilhas aux = new Pilhas (p.tamanhoPilha());
        while (p.estaVazia() && p.elementoTopo() < i) {
            aux.push(aux.pop());
        }
        p.push(i);
        while (!aux.estaVazia()) {
            p.push(aux.pop());
        }
        return true;
    }
    
    //um analista brincalhão resolveu pregar uma peça, ele alterou o método pop();
    //ao invés de desempilhar o último, ele desempilha o penúltimo
    //refaça este procedimento, utilizando pilhas auxiliares, se necessário

    public static void main(String[] args){

    }
}
