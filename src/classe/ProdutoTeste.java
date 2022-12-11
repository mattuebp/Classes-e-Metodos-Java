package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89); // Instanciando um objeto "p1" do tipo "Produto" através do construtor;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 10.00;

        Produto.desconto = 0.29;

        System.out.println(p1.nome);
        double precoFinal1 = p1.precoComDesconto();
        System.out.println(precoFinal1);

        System.out.println(p2.nome);
        double precoFinal2 = p2.precoComDesconto();
        System.out.println(precoFinal2);

        double mediaCarinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$ %.2f.", mediaCarinho);
    }
}
