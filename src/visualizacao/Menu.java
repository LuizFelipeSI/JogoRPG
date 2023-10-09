package visualizacao;

import entidades.*;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {

    public MundoVirtual mv;
    Scanner scan = new Scanner(System.in);
    String n;
    int numero;


    public void menuPosicao(MundoVirtual mv) {

        while(true) {

            if (mv.getPosicao() == 0) {
                System.out.println("=======================================");
                System.out.println("fase inicial:");
                System.out.println("X - - - - - - -");
                System.out.println("1 - caminhar");
                System.out.println("2 - estatisticas do personagem");
                System.out.println("3 - checar progresso");
                n = scan.next();

                if (Pattern.matches("[a-zA-Z]+", n)) {
                    System.out.println("Somente números são válidos!");
                } else {
                    numero = Integer.parseInt(n);

                    if (numero == 1) {
                        mv.getPersonagens().get(0).caminhar(mv);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        mv.checarProgresso();
                    }
                }

            } else if (mv.getPosicao() == 1) {
                System.out.println("=======================================");
                System.out.println("fase 2:");
                System.out.println("V X - - - - - -");
                System.out.println("Um inimigo te desafiou!");
                System.out.println("1 - atacar");
                System.out.println("2 - estatisticas do personagem");
                System.out.println("3 - estatisticas do inimigo");
                System.out.println("4 - checar progresso");
                n = scan.next();

                if (Pattern.matches("[a-zA-Z]+", n)) {
                    System.out.println("Somente números são válidos!");
                } else {
                    numero = Integer.parseInt(n);

                    if (numero == 1) {
                        mv.getPersonagens().get(0).atacar(mv.getInimigos().get(0));
                        System.out.println("você derrotou o inimigo!");
                        mv.getPersonagens().get(0).setNivel(mv.getPersonagens().get(0).getNivel() + 1);
                        System.out.println("você subiu para o nível " + mv.getPersonagens().get(0).getNivel());
                        mv.getPersonagens().get(0).pegarItem(mv,0);
                        mv.getPersonagens().get(0).usarItem(mv,0);
                        mv.getPersonagens().get(0).getItens().add(mv.getItens().get(0));

                        mv.setPosicao(mv.getPosicao() + 1);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        System.out.println(mv.getInimigos().get(0).toString());
                    }
                    else if (numero == 4) {
                        mv.checarProgresso();
                    }
                }

            } else if (mv.getPosicao() == 2) {
                System.out.println("=======================================");
                System.out.println("fase 3:");
                System.out.println("V V X - - - - -");
                System.out.println("1 - caminhar");
                System.out.println("2 - estatisticas do personagem");
                System.out.println("3 - checar progresso");
                n = scan.next();

                if (Pattern.matches("[a-zA-Z]+", n)) {
                    System.out.println("Somente números são válidos!");
                } else {
                    numero = Integer.parseInt(n);

                    if (numero == 1) {
                        mv.getPersonagens().get(0).caminhar(mv);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        mv.checarProgresso();
                    }
                }

            } else if (mv.getPosicao() == 3) {
                System.out.println("=======================================");
                System.out.println("fase 4:");
                System.out.println("V V V X - - - -");
                System.out.println("Um inimigo te desafiou!");
                System.out.println("1 - atacar");
                System.out.println("2 - estatisticas do personagem");
                System.out.println("3 - estatisticas do inimigo");
                System.out.println("4 - checar progresso");
                n = scan.next();

                if (Pattern.matches("[a-zA-Z]+", n)) {
                    System.out.println("Somente números são válidos!");
                } else {
                    numero = Integer.parseInt(n);

                    if (numero == 1) {
                        mv.getPersonagens().get(0).atacar(mv.getInimigos().get(1));
                        System.out.println("você derrotou o inimigo!");
                        mv.getPersonagens().get(0).setNivel(mv.getPersonagens().get(0).getNivel() + 1);
                        System.out.println("você subiu para o nível " + mv.getPersonagens().get(0).getNivel());
                        mv.getPersonagens().get(0).pegarItem(mv,1);
                        mv.getPersonagens().get(0).usarItem(mv,1);
                        mv.getPersonagens().get(0).getItens().add(mv.getItens().get(1));

                        mv.setPosicao(mv.getPosicao() + 1);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        System.out.println(mv.getInimigos().get(1).toString());
                    } else if (numero == 4) {
                        mv.checarProgresso();
                    }
                }

            } else if (mv.getPosicao() == 4) {
                System.out.println("=======================================");
                System.out.println("fase 5:");
                System.out.println("V V V V X - - -");
                System.out.println("1 - caminhar");
                System.out.println("2 - estatisticas do personagem");
                System.out.println("3 - checar progresso");
                n = scan.next();

                if (Pattern.matches("[a-zA-Z]+", n)) {
                    System.out.println("Somente números são válidos!");
                } else {
                    numero = Integer.parseInt(n);

                    if (numero == 1) {
                        mv.getPersonagens().get(0).caminhar(mv);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        mv.checarProgresso();
                    }
                }

            } else if (mv.getPosicao() == 5) {
                System.out.println("=======================================");
                System.out.println("fase 6:");
                System.out.println("V V V V V X - -");
                System.out.println("Um inimigo te desafiou!");
                System.out.println("1 - atacar");
                System.out.println("2 - estatisticas do personagem");
                System.out.println("3 - estatisticas do inimigo");
                System.out.println("4 - checar progresso");
                n = scan.next();

                if (Pattern.matches("[a-zA-Z]+", n)) {
                    System.out.println("Somente números são válidos!");
                } else {
                    numero = Integer.parseInt(n);

                    if (numero == 1) {
                        mv.getPersonagens().get(0).atacar(mv.getInimigos().get(2));
                        System.out.println("você derrotou o inimigo!");
                        mv.getPersonagens().get(0).setNivel(mv.getPersonagens().get(0).getNivel() + 1);
                        System.out.println("você subiu para o nível " + mv.getPersonagens().get(0).getNivel());
                        if (mv.getPersonagens().get(0).getNivel() == 4) {
                            System.out.println("você desbloqueou a sua ULTIMATE!");
                        }
                        mv.getPersonagens().get(0).pegarItem(mv,2);
                        mv.getPersonagens().get(0).usarItem(mv,2);
                        mv.getPersonagens().get(0).getItens().add(mv.getItens().get(2));

                        mv.setPosicao(mv.getPosicao() + 1);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        System.out.println(mv.getInimigos().get(2).toString());
                    } else if (numero == 4) {
                        mv.checarProgresso();
                    }
                }

            } else if (mv.getPosicao() == 6) {
                System.out.println("=======================================");
                System.out.println("fase 7:");
                System.out.println("V V V V V V X -");
                System.out.println("1 - caminhar");
                System.out.println("2 - estatisticas do personagem");
                System.out.println("3 - checar progresso");
                n = scan.next();

                if (Pattern.matches("[a-zA-Z]+", n)) {
                    System.out.println("Somente números são válidos!");
                } else {
                    numero = Integer.parseInt(n);

                    if (numero == 1) {
                        mv.getPersonagens().get(0).caminhar(mv);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        mv.checarProgresso();
                    }
                }
            }

            else if (mv.getPosicao() == 7) {
                if (mv.getPersonagens().get(0).getNivel() == 4) {
                    System.out.println("=======================================");
                    System.out.println("fase final:");
                    System.out.println("V V V V V V V X");
                    System.out.println("O BOSS TE DESAFIOU!");
                    System.out.println("1 - atacar");
                    System.out.println("2 - estatisticas do personagem");
                    System.out.println("3 - estatisticas do inimigo");
                    System.out.println("4 - checar progresso");
                    System.out.println("5 - usar ULTIMATE");
                    n = scan.next();

                    if (Pattern.matches("[a-zA-Z]+", n)) {
                        System.out.println("Somente números são válidos!");
                    } else {
                        numero = Integer.parseInt(n);

                        if (numero == 1) {
                            mv.getPersonagens().get(0).atacar(mv.getInimigos().get(3));
                            System.out.println("vez do inimigo:");
                            mv.getInimigos().get(3).atacar(mv.getPersonagens().get(0));
                            System.out.println("sua vez:");
                            mv.getPersonagens().get(0).atacar(mv.getInimigos().get(3));
                            System.out.println("você derrotou o inimigo!");
                            mv.getMissoes().get(0).completar(mv);
                            mv.setPosicao(mv.getPosicao() + 1);
                            break;
                        } else if (numero == 2) {
                            System.out.println(mv.getPersonagens().get(0).toString());
                        } else if (numero == 3) {
                            System.out.println(mv.getInimigos().get(3).toString());
                        } else if (numero == 4) {
                            mv.checarProgresso();
                        } else if (numero == 5) {
                            mv.getPersonagens().get(0).usarHabilidades(mv);
                        }
                    }
                } else {
                    System.out.println("=======================================");
                    System.out.println("fase final:");
                    System.out.println("V V V V V V V X");
                    System.out.println("O BOSS TE DESAFIOU!");
                    System.out.println("1 - atacar");
                    System.out.println("2 - estatisticas do personagem");
                    System.out.println("3 - estatisticas do inimigo");
                    System.out.println("4 - checar progresso");
                    n = scan.next();

                    if (Pattern.matches("[a-zA-Z]+", n)) {
                        System.out.println("Somente números são válidos!");
                    } else {
                        numero = Integer.parseInt(n);

                        if (numero == 1) {
                            mv.getPersonagens().get(0).atacar(mv.getInimigos().get(3));
                            System.out.println("vez do inimigo:");
                            mv.getInimigos().get(3).atacar(mv.getPersonagens().get(0));
                            System.out.println("sua vez:");
                            mv.getPersonagens().get(0).atacar(mv.getInimigos().get(3));
                            System.out.println("você derrotou o inimigo!");
                            mv.getMissoes().get(0).completar(mv);
                            mv.setPosicao(mv.getPosicao() + 1);
                            break;
                        } else if (numero == 2) {
                            System.out.println(mv.getPersonagens().get(0).toString());
                        } else if (numero == 3) {
                            System.out.println(mv.getInimigos().get(3).toString());
                        } else if (numero == 4) {
                            mv.checarProgresso();
                        }
                    }
                }
            }
        }
    }
}
