public class TesteLista {
    public static void main(String[] args) {
        Lista2 l = new Lista2();
        l.insereInicio(1);
        l.insereInicio(2);
        l.insereInicio(3);
        l.insereInicio(4);
        System.out.println(l);

        if(!l.estaVazia()) {
          System.out.println(l.removeInicio() + "saiu do inicio da lista");
          System.out.println(l);
        }
    }
}