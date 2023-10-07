package visualizacao;

import entidades.*;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {

    public MundoVirtual mv;

    public void menu(MundoVirtual mv) {

        Personagem p = new Personagem("matheus", 12, 112, 212);

        Inimigo i = new Inimigo("corrupção", 30, 80, 190);

        Habilidade h1 = new Habilidade("veneno", "envenena os cara", 40);
        Habilidade h2 = new Habilidade("visão raio laser", "vê tudo", 60);
        Habilidade h3 = new Habilidade("teleporte de 1m", "teleporta 1m pra frente", 30);
        Habilidade h4 = new Habilidade("beijo lento", "apixona qualquer um", 25);

        Item i1 = new Item("roupa do homem sereia", "roupa do homem sereia", "armadura");
        Item i2 = new Item("ocarina do Link", "instrumento angelical", "arma");
        Item i3 = new Item("anel do lanterna", "brilha verde", "acessório");
        Item i4 = new Item("pistola 9mm", "fura moletom", "arma");

        Missao m1 = new Missao("procurar o dedo do lula", "em uma majestosa e desafiadora busca pelo" +
                " dedo de lula, matheus passará por poucas e boas");


        p.getItens().add(i1);
        p.getItens().add(i2);
        p.getItens().add(i3);
        p.getItens().add(i4);

        p.getHabilidades().add(h1);
        p.getHabilidades().add(h2);

        i4.getEfeitos().add("tiro");
        i2.getEfeitos().add("música boa");



        m1.getRecompensas().add(i3);
        m1.getRecompensas().add(i4);
        m1.getObjetivos().add(m1.getTitulo());

        i.getHabilidadesCombate().add(h4);

        Scanner scan = new Scanner(System.in);

        String n;

        while(true) {
            System.out.println("------------------------------");
            System.out.println("1 - iniciar missão");
            System.out.println("2 - atacar");
            System.out.println("3 - caminhar");
            System.out.println("4 - pegar item");
            System.out.println("5 - usar item");
            System.out.println("6 - completar missão");
            System.out.println("0 - sair");
            System.out.println("------------------------------");
            n = scan.next();

            if (Pattern.matches("[a-zA-Z]+", n)){
                System.out.println("Somente números são válidos!");
            } else {
                int numero = Integer.parseInt(n);

                if (numero == 1) {
                    mv.inicarMissao(m1, p);
                } else if (numero == 2) {
                    mv.ataquePersonagem(p, i);
                } else if (numero == 3) {
                    mv.caminharPersonagem(p);
                } else if (numero == 4) {
                    mv.pegarItemPersonagem(p, i4);
                } else if (numero == 5) {
                    mv.usarItemPersonagem(p, i2);
                } else if (numero == 6) {
                    mv.completarMissao(m1, p);
                } else if (numero == 0) {
                    break;
                } else {
                    System.out.println("opção inválida");
                }
            }
        }
    }
}
