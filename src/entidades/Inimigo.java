package entidades;

import java.util.ArrayList;
import java.util.List;

public class Inimigo {

    private String nome;
    private Integer nivel;
    private Integer saude;
    private Integer energia;
    private List<Habilidade> habilidadesCombate;

    public Inimigo() {
    }

    public Inimigo(String nome, Integer nivel, Integer saude, Integer energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.energia = energia;
        this.habilidadesCombate = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
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

    public List<Habilidade> getHabilidadesCombate() {
        return habilidadesCombate;
    }

    public void atacar(Personagem personagem) {
        System.out.println(this.nome + " atacou " + personagem.getNome() + " com " + habilidadesCombate.get(0).getNome());
        personagem.setSaude(personagem.getSaude() - 30);
        System.out.println(personagem.getNome() + " está com " + personagem.getSaude() + " de saúde");
    }

    @Override
    public String toString() {
        return "Inimigo: " + "\n" +
                "nome = " + nome + "\n" +
                "nivel = " + nivel + "\n" +
                "saude = " + saude + "\n" +
                "energia = " + energia;
    }
}
