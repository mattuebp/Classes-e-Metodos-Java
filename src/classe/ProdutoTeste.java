package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89, 0.25); // Instanciando um objeto "p1" do tipo "Produto" através do construtor;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 10.00;
        p2.desconto = 0.3;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        double mediaCarinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$ %.2f.", mediaCarinho);
    }
}
