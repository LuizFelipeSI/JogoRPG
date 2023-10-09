package entidades;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

    private String nome;
    private Integer dano;
    private Integer saude;
    private Integer energia;
    private Integer nivel;
    private List<Habilidade> habilidades;
    private List<Item> itens;

    public Personagem() {
    }

    public Personagem(String nome, Integer dano, Integer saude, Integer energia) {
        this.nivel = 1;
        this.nome = nome;
        this.dano = dano;
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

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void atacar(Inimigo inimigo) {
        System.out.println("Você atacou o inimigo " + inimigo.getNome());
        inimigo.setSaude(inimigo.getSaude() - getDano());
        System.out.println("O inimigo " + inimigo.getNome() + " está com " + inimigo.getSaude() + " de saúde");
    }

    public void pegarItem(MundoVirtual mv, int x) {

        System.out.println("Você ganhou o item " + mv.getItens().get(x).getNome());
        itens.add(mv.getItens().get(x));
    }

    public void usarItem(MundoVirtual mv, int x) {
        if (x == 0) {
            System.out.println("sua vida aumentou em 20");
            mv.getPersonagens().get(0).setSaude(mv.getPersonagens().get(0).getSaude() + 20);
        } else if (x == 1) {
            System.out.println("sua energia aumentou em 50");
            mv.getPersonagens().get(0).setEnergia(mv.getPersonagens().get(0).getEnergia() + 50);
        } else if (x == 2) {
            System.out.println("seu dano aumentou em 40");
            mv.getPersonagens().get(0).setDano(mv.getPersonagens().get(0).getDano() + 40);
        }
    }

    public void caminhar(MundoVirtual mv) {
        mv.setPosicao(mv.getPosicao() + 1);
    }

    public void usarHabilidades(MundoVirtual mv) {
        mv.getPersonagens().get(0).setDano(mv.getPersonagens().get(0).getDano() + 50);
        mv.getPersonagens().get(0).setSaude(mv.getPersonagens().get(0).getSaude() + 50);
        mv.getPersonagens().get(0).setEnergia(mv.getPersonagens().get(0).getEnergia()
                - mv.getPersonagens().get(0).getHabilidades().get(0).getCustoEnergia());

        mv.getPersonagens().get(0).setNivel(mv.getPersonagens().get(0).getNivel() + 1);

        System.out.println("seu dano e saúde foram aumentados em 50 pontos");
    }

    @Override
    public String toString() {
        return "nome = " + nome + "\n" +
                "dano = " + dano + "\n" +
                "saude = " + saude + "\n" +
                "energia = " + energia;
    }
}
