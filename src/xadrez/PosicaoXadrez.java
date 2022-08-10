package xadrez;

import tabuleiro.Posicao;

/**
 * Classe PosicaoXadrez
 * Classe que define posicao inical e posicao final de uma peca
 * Utilizada para utilizar a movimentacao de uma peca de xadrez
 *
 * autor: marcosap
 */
public class PosicaoXadrez {
    private Integer coluna;
    private Integer linha;

    /** Getters e Setters */
    public Integer getColuna() {
        return coluna;
    }

    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }

    public Integer getLinha() {
        return linha;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    /** Metodos de processamento do jogo */
    /**
     * IMPORTANTE:implementar definicao de posicao
     * metodo paraPosicao
     * devolve a posicao final de um movimento de uma peca de xadrez
     */
    public Posicao paraPosicao(){

        return null; //retornando nulo ate o final da implementacao
    }

    /**
     * IMPORTANTE:implementar definicao de posicao
     * metodo daPosicao
     * devolve a posicao inicial de um movimento de uma peca de xadrez
     */
    public PosicaoXadrez daPosicao(Posicao posicao){

        return null; //retornando nulo ate o final da implementacao
    }
}
