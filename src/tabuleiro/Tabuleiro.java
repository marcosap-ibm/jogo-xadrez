package tabuleiro;

public class Tabuleiro {

    private Integer linha;
    private Integer coluna;

    public Tabuleiro(){

    }
    public Tabuleiro(Integer linha, Integer coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    //retornar posicao no tabuleiro
    public Integer getLinha() {
        return linha;
    }

    public Integer getColuna() {
        return coluna;
    }

    //Complementar o metodo
    public Peca peca(Integer linha, Integer coluna){

        //return;
    }

    //Complementar o metodo
    public Peca peca(Posicao posicao){

        //return;
    }

    //Complementar o metodo
    public void lugarPeca(Peca peca, Posicao posicao){

    }

    //Complementar o metodo
    public Peca removerPeca(Posicao posicao){
        //return;
    }

    //Complementar o metodo
    public boolean posicaoExiste(Posicao posicao){
        //return;
    }

    //Complementar o metodo
    public boolean aquiTemUmaPeca(Posicao posicao){
        //return;
    }

}
