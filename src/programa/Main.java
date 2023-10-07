package programa;

import entidades.*;
import visualizacao.Menu;

public class Main {

    public static void main(String[] args) {

        System.out.println("JOGO RPG!!!");


//        Personagem p = new Personagem("matheus", 12, 112, 212);
//
//        Inimigo i = new Inimigo("corrupção", 30, 80, 190);
//
//        Habilidade h1 = new Habilidade("veneno", "envenena os cara", 40);
//        Habilidade h2 = new Habilidade("visão raio laser", "vê tudo", 60);
//        Habilidade h3 = new Habilidade("teleporte de 1m", "teleporta 1m pra frente", 30);
//        Habilidade h4 = new Habilidade("beijo lento", "apixona qualquer um", 25);
//
//        Item i1 = new Item("roupa do homem sereia", "roupa do homem sereia", "armadura");
//        Item i2 = new Item("ocarina do Link", "instrumento angelical", "arma");
//        Item i3 = new Item("anel do lanterna", "brilha verde", "acessório");
//        Item i4 = new Item("pistola 9mm", "fura moletom", "arma");
//
//        Missao m1 = new Missao("procurar o dedo do lula", "em uma majestosa e desafiadora busca pelo" +
//                " dedo de lula, matheus passará por poucas e boas");
//
//
//
//        p.getItens().add(i1);
//
//        p.getHabilidades().add(h1);
//        p.getHabilidades().add(h2);
//
//        i4.getEfeitos().add("tiro");
//        i2.getEfeitos().add("música boa");
//
//        m1.getRecompensas().add(i3);
//        m1.getRecompensas().add(i4);
//        m1.getObjetivos().add(m1.getTitulo());
//
//        i.getHabilidadesCombate().add(h4);


        Menu m = new Menu();


//        m1.iniciar(p);
//        p.atacar(i);
//        p.caminhar(10, 8);
//        p.pegarItem(i2);
//
//
//        m1.atualizar();
//
//        i.atacar(p);
//
//        p.usarHabilidades(h3);
//
//
//
//        m1.completar(p);
//
//        p.usarItem(i4);
//
//        p.usarHabilidades(h1);



        MundoVirtual mv = new MundoVirtual();

//        mv.inicarMissao(m1, p);
//        mv.ataquePersonagem(p, i);
//        mv.ataqueInimigo(i, p);
//        mv.caminharPersonagem(p);
//        mv.pegarItemPersonagem(p, i2);
//
//        mv.usarHabilidadePersonagem(p, h1);
//
//        mv.completarMissao(m1, p);
//        mv.usarItemPersonagem(p, i2);

        m.menu(mv);
    }
}
