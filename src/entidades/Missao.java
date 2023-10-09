package entidades;

import java.util.ArrayList;
import java.util.List;

public class Missao {

    private String titulo;
    private String descricao;
    private List<Item> recompensas;
    private List<String> objetivos;

    public Missao() {
    }

    public Missao(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.recompensas = new ArrayList<>();
        this.objetivos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Item> getRecompensas() {
        return recompensas;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public void iniciar(Personagem personagem) {
        System.out.println("A missão " + this.titulo + " foi iniciada por " + personagem.getNome());
    }

    public void completar(MundoVirtual mv) {
        System.out.println("A missão " + this.titulo + " foi completada");
        mv.getPersonagens().get(0).pegarItem(mv,3);
    }

    public void fracassar(MundoVirtual mv) {
        System.out.println("Voçê morreu!!!");
    }
}
