package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MundoVirtual {

    private Integer posicao = 0;
    private Integer x = 8;
    private int[] tabuleiro = new int[x];
    private Double progresso;
    private List<Personagem> personagens;
    private List<Missao> missoes;
    private List<Inimigo> inimigos;
    private List<Item> itens;

    Scanner sc = new Scanner(System.in);

    public MundoVirtual() {
        this.progresso = 0.0;
        this.personagens = new ArrayList<>();
        this.missoes = new ArrayList<>();
        this.inimigos = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Double getProgresso() {
        return progresso;
    }

    public void setProgresso(Double progresso) {
        this.progresso = progresso;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public List<Missao> getMissoes() {
        return missoes;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public List<Item> getItens() {
        return itens;
    }

    public Integer getX() {
        return x;
    }

    public int[] getTabuleiro() {
        return tabuleiro;
    }


    public void checarProgresso() {
        System.out.println("Progresso do jogo: " + ((100 / x) * (posicao + 1)) + "%");
    }
}
