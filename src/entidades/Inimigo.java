package entidades;

import java.util.ArrayList;
import java.util.List;

public class Inimigo {

    private String nome;
    private Integer dano;
    private Integer saude;
    private Integer energia;
    private Integer nivel;
    private List<Item> itens;

    public Inimigo() {
    }

    public Inimigo(String nome, Integer dano, Integer saude, Integer energia, Integer nivel) {
        this.nome = nome;
        this.dano = dano;
        this.saude = saude;
        this.energia = energia;
        this.nivel = nivel;
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return dano;
    }

    public void setNivel(Integer nivel) {
        this.dano = nivel;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getSaude() {
        return saude;
    }

    public void setSaude(Integer saude) {
        this.saude = saude;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public List<Item> getHabilidadesCombate() {
        return itens;
    }

    public void atacar(Personagem personagem) {
        System.out.println(this.nome + " atacou " + personagem.getNome());
        personagem.setSaude(personagem.getSaude() - getDano());
        System.out.println(personagem.getNome() + " está com " + personagem.getSaude() + " de saúde");
    }

    @Override
    public String toString() {
        return "Inimigo: " + "\n" +
                "nome = " + nome + "\n" +
                "dano = " + dano + "\n" +
                "saude = " + saude + "\n" +
                "energia = " + energia;
    }
}
