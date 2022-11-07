public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);
        System.out.println(no1);
        System.out.println(no2);
        //algumas ligações
        no1.setProx(no2);
        no2.setAnt(no1);
        //alteração direta
        no1.setInfo(100);
        //alteração por ligação
        no1.getProx().setInfo(200);
        System.out.println(no1);
        System.out.println(no2);
    }
}