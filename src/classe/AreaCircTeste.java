package classe;

public class AreaCircTeste {

    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5.6);
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5);
        System.out.println(a2.area());

        System.out.println(AreaCirc.area(5));// Calculando a área sem a necessidade de criar instanciar um objeto.
    }
}
