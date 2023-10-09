package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personagem {

    private String nome;
    private Integer dano;
    private Integer saude;
    private Integer energia;
    private Integer nivel;
    private List<Habilidade> habilidades;
    private List<Item> itens;
    private boolean fracasso = false;
    private boolean sucesso = false;

    Scanner sc = new Scanner(System.in);

    public boolean isFracasso() {
        return fracasso;
    }

    public void setFracasso(boolean fracasso) {
        this.fracasso = fracasso;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

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

    public void atacar(MundoVirtual mv, int x) {
        System.out.println("Você atacou o inimigo " + mv.getInimigos().get(x).getNome());
        mv.getInimigos().get(x).setSaude(mv.getInimigos().get(x).getSaude() - getDano());
        System.out.println("O inimigo " + mv.getInimigos().get(x).getNome() + " está com " + mv.getInimigos().get(x).getSaude() + " de saúde");

        if (mv.getInimigos().get(x).getSaude() <= 0) {
            System.out.println("você derrotou o inimigo!");
            if (mv.getPersonagens().get(0).getNivel() < 4) {
                mv.getPersonagens().get(0).setNivel(mv.getPersonagens().get(0).getNivel() + 1);
                System.out.println("você subiu para o nível " + mv.getPersonagens().get(0).getNivel());
                if (mv.getPersonagens().get(0).getNivel() == 4) {
                    System.out.println("você desbloqueou a sua ULTIMATE!");
                }
            }
            if (x == 3) {
                mv.getMissoes().get(0).completar(mv);
                mv.getPersonagens().get(0).setNivel(mv.getPersonagens().get(0).getNivel() + 1);
                setSucesso(true);
            } else {
                mv.getPersonagens().get(0).pegarItem(mv,x);
                while (true) {
                    System.out.println("deseja usar o item? (s/n) / o item só pode ser usado nessa fase");
                    String opcao = sc.nextLine().toLowerCase();
                    if (opcao.equalsIgnoreCase("s")) {
                        mv.getPersonagens().get(0).usarItem(mv, x);
                        break;
                    } else if (opcao.equalsIgnoreCase("n")){
                        System.out.println("o item foi descartado");
                        break;
                    } else {
                        System.out.println("opção inválida");
                    }
                }
            }
            mv.getPersonagens().get(0).getItens().add(mv.getItens().get(x));

            mv.setPosicao(mv.getPosicao() + 1);
        } else {
            System.out.println("vez do inimigo:");
            mv.getInimigos().get(x).atacar(mv.getPersonagens().get(0));
            if (mv.getPersonagens().get(0).getSaude() <= 0) {
                mv.getMissoes().get(0).fracassar();
                setFracasso(true);
                mv.setPosicao(mv.getPosicao() + 1);
            } else {
                mv.getPersonagens().get(0).atacar(mv, x);
            }
        }
    }

    public void pegarItem(MundoVirtual mv, int x) {
        System.out.println();
        if (x == 3) {
            System.out.println("Você ganhou o item " + mv.getMissoes().get(0).getRecompensas().get(0));
            itens.add(mv.getMissoes().get(0).getRecompensas().get(0));
        } else {
            System.out.println("Você ganhou o item " + mv.getItens().get(x).toString());
            itens.add(mv.getItens().get(x));
        }
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
        if (mv.getPersonagens().get(0).getEnergia() >= mv.getPersonagens().get(0).getHabilidades().get(0).getCustoEnergia()) {
            mv.getPersonagens().get(0).setDano(mv.getPersonagens().get(0).getDano() + 50);
            mv.getPersonagens().get(0).setSaude(mv.getPersonagens().get(0).getSaude() + 50);
            mv.getPersonagens().get(0).setEnergia(mv.getPersonagens().get(0).getEnergia()
                    - mv.getPersonagens().get(0).getHabilidades().get(0).getCustoEnergia());

            mv.getPersonagens().get(0).setNivel(mv.getPersonagens().get(0).getNivel() + 1);

            System.out.println("seu dano e saúde foram aumentados em 50 pontos");
        } else {
            System.out.println("você não tem energia suficiente");
        }
    }

    @Override
    public String toString() {
        return "nome = " + nome + "\n" +
                "dano = " + dano + "\n" +
                "saude = " + saude + "\n" +
                "energia = " + energia;
    }
}
