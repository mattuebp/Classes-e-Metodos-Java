package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data dDev = new Data(); // Definindo o primeiro objeto de forma mais simples;
        dDev.dia = 15;
        dDev.mes = 12;
        dDev.ano = 1998;

        Data dMaeDev = new Data(); // Definindo um objeto de forma mais simples;
        dMaeDev.dia = 21;
        dMaeDev.mes = 6;
        dMaeDev.ano = 1966;

        Data dPadrao = new Data(); // Definindo um objeto a partir do construtor padrão (com os valores pré-setados
        // no construtor padrão;

        var dPaiDev = new Data(07, 04, 1964); // Definindo um objeto a partir do construtor
        // formatado com parametros iniciais.

        String dataDevFormatada = dDev.obterDataFormatada(); // Verificando o método criado na classe.
        System.out.println(dataDevFormatada);
        System.out.println(dMaeDev.obterDataFormatada()); // Verificando que o método pode ser chamado dentro do println.

        dDev.imprimirDataFormatada(); // Método que imprime a data formatada a partir de outro método;
        dMaeDev.imprimirDataFormatada(); // Método que imprime a data formatada a partir de outro método;

        dPadrao.imprimirDataFormatada();
        dPaiDev.imprimirDataFormatada();
    }
}
