package entidades;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String nome;
    private String descricao;
    private String tipo;
    private List<String> efeitos;

    public Item() {
    }

    public Item(String nome, String descricao, String tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.efeitos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getEfeitos() {
        return efeitos;
    }

    @Override
    public String toString() {
        return nome + ": " + descricao;
    }
}
