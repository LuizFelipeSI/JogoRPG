package programa;

import entidades.*;
import visualizacao.Menu;

public class Main {

    public static void main(String[] args) {

        Menu m = new Menu();
        MundoVirtual mv = new MundoVirtual();

        Personagem p = new Personagem("Kratos", 40, 20, 60);

        Inimigo in1 = new Inimigo("Orc", 20, 30, 160, 1);
        Inimigo in2 = new Inimigo("Mago", 40, 20, 300, 2);
        Inimigo in3 = new Inimigo("Dragão", 80, 40, 1000, 3);
        Inimigo in4 = new Inimigo("Rei dos montros", 40, 200, 1200, 4);

        Habilidade h1 = new Habilidade("ultimate", "aumenta em 50 pontos de dano e saúde", 100);

        Item i1 = new Item("poção de cura", "aumenta sua saúde em 20 pontos", "utilitário");
        Item i2 = new Item("pulmão de aço", "aumenta sua energia em 50 pontos", "encantamento");
        Item i3 = new Item("chamas do caos", "aumenta seu dano em 40 pontos", "arma");
        Item i4 = new Item("coroa do rei", "os inimigos não te atacam mais", "vestimenta");

        Missao m1 = new Missao("derrotar o líder do castelo", "missão de nível 4");


        p.getHabilidades().add(h1);

        m1.getRecompensas().add(i3);

        m1.getObjetivos().add(m1.getTitulo());


        p.getHabilidades().add(h1);

        mv.getPersonagens().add(p);
        mv.getInimigos().add(in1);
        mv.getInimigos().add(in2);
        mv.getInimigos().add(in3);
        mv.getInimigos().add(in4);
        mv.getItens().add(i1);
        mv.getItens().add(i2);
        mv.getItens().add(i3);
        mv.getItens().add(i4);
        mv.getMissoes().add(m1);

        System.out.println("JOGO RPG!!!");
        System.out.println();
        mv.getMissoes().get(0).iniciar(p);
        System.out.println();

        m.menuPosicao(mv);
    }
}
