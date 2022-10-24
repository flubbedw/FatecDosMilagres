public class TestePilhaEstatica {
	public static void main(String[] args) {
		
		//aqui eu chamo o outro arquivo
		PilhaEstatica p1 = new PilhaEstatica(5);

		System.out.println("p1 criada: " + p1);
		int i = 10;
		while (!p1.estaCheia()) {
			p1.push(i);
			i = i++;
			System.out.println(p1);
		}
		while (!p1.estaVazia()) {
			System.out.println(p1.pop() + " foi desempilhado");
			System.out.println(p1);
		}
	}
}