package visualizacao;

import entidades.*;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {

    public MundoVirtual mv;
    Scanner scan = new Scanner(System.in);
    String n;
    int numero;
    boolean fimDeJogo = false;

    public boolean isFimDeJogo() {
        return fimDeJogo;
    }

    public void setFimDeJogo(boolean fimDeJogo) {
        this.fimDeJogo = fimDeJogo;
    }

    public void menuPosicao(MundoVirtual mv) {

        while(!fimDeJogo) {

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
                    } else {
                        System.out.println("opção inválida");
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
                        mv.getPersonagens().get(0).atacar(mv, 0);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        System.out.println(mv.getInimigos().get(0).toString());
                    }
                    else if (numero == 4) {
                        mv.checarProgresso();
                    } else {
                        System.out.println("opção inválida");
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
                    } else {
                        System.out.println("opção inválida");
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
                        mv.getPersonagens().get(0).atacar(mv,1);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        System.out.println(mv.getInimigos().get(1).toString());
                    } else if (numero == 4) {
                        mv.checarProgresso();
                    } else {
                        System.out.println("opção inválida");
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
                    } else {
                        System.out.println("opção inválida");
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
                        mv.getPersonagens().get(0).atacar(mv,2);
                    } else if (numero == 2) {
                        System.out.println(mv.getPersonagens().get(0).toString());
                    } else if (numero == 3) {
                        System.out.println(mv.getInimigos().get(2).toString());
                    } else if (numero == 4) {
                        mv.checarProgresso();
                    } else {
                        System.out.println("opção inválida");
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
                    } else {
                        System.out.println("opção inválida");
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
                            mv.getPersonagens().get(0).atacar(mv,3);
                            break;
                        } else if (numero == 2) {
                            System.out.println(mv.getPersonagens().get(0).toString());
                        } else if (numero == 3) {
                            System.out.println(mv.getInimigos().get(3).toString());
                        } else if (numero == 4) {
                            mv.checarProgresso();
                        } else if (numero == 5) {
                            mv.getPersonagens().get(0).usarHabilidades(mv);
                        } else {
                            System.out.println("opção inválida");
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
                            mv.getPersonagens().get(0).atacar(mv,3);
                            break;
                        } else if (numero == 2) {
                            System.out.println(mv.getPersonagens().get(0).toString());
                        } else if (numero == 3) {
                            System.out.println(mv.getInimigos().get(3).toString());
                        } else if (numero == 4) {
                            mv.checarProgresso();
                        } else {
                            System.out.println("opção inválida");
                        }
                    }
                }
            }
        }
    }
}
