package entidades;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

    private String nome;
    private Integer nivel;
    private Integer saude;
    private Integer energia;
    private List<Habilidade> habilidades;
    private List<Item> itens;

    public Personagem() {
    }

    public Personagem(String nome, Integer nivel, Integer saude, Integer energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.energia = energia;
        this.habilidades = new ArrayList<>();
        this.itens = new ArrayList<>();
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

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void atacar(Inimigo inimigo) {
        System.out.println("Você atacou o inimigo " + inimigo.getNome());
        inimigo.setSaude(inimigo.getSaude() - 40);
        System.out.println("O inimigo " + inimigo.getNome() + " está com " + inimigo.getSaude() + " de saúde");
    }

    public void pegarItem(Item item) {
        System.out.println("Você pegou o item " + item.getNome());
        itens.add(item);
    }

    public void usarItem(Item item) {
        for (Item i : itens) {
            if (i.getNome().equals(item.getNome())) {
                item.usarItem(item);
            }
        }
    }

    public void caminhar(double x) {
        MundoVirtual mv = new MundoVirtual();

        if (x > mv.getX()) {
            System.out.println("Uma das coordenadas não existe no tabuleiro");
        } else {
            System.out.println("Você foi para o ponto " + x);
        }
    }

    public void usarHabilidades(Habilidade habilidade) {
        for (Habilidade h : habilidades) {
            if (h.getNome().equals(habilidade.getNome())) {
                System.out.println("Você ativou a habilidade " + h.getNome());
            }
        }
    }

    @Override
    public String toString() {
        return "Personagem: " + "\n" +
                "nome = " + nome + "\n" +
                "nivel = " + nivel + "\n" +
                "saude = " + saude + "\n" +
                "energia = " + energia;
    }
}
