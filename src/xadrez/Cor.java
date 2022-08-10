package xadrez;
/**
 * Enumeration para definir as cores das pessas de xadrez
 * um Enumeration contem uma lista de valores fixas, no caso
 * com as cores das pessas do jogo de xadrez
 *
 * Autor: marcosap
 */
public enum Cor {
    BRANCAS(1),
    PRETAS(2);

    /**
     * Inicializa os valores do enum
     * e atribui para a variavel valor
     */
    private final int valor;
    Cor(int valorCor){
        valor = valorCor;
    }

    /**
     * metodo getValor
     * utilizado para retornar o valor do enum
     * @return valor
     */
    public int getValor(){
        return valor;
    }
}
