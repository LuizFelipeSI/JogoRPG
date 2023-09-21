package entidades;

import java.util.ArrayList;
import java.util.List;

public class MundoVirtual {

    private Double progresso;
    private List<Personagem> personagens;
    private List<Missao> missoes;
    private List<Inimigo> inimigos;

    public MundoVirtual() {
        this.progresso = 0.0;
        this.personagens = new ArrayList<>();
        this.missoes = new ArrayList<>();
        this.inimigos = new ArrayList<>();
    }

    public Double getProgresso() {
        return progresso;
    }

    public void setProgresso(Double progresso) {
        this.progresso = progresso;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public List<Missao> getMissoes() {
        return missoes;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public void inicarMissao(Missao missao, Personagem personagem) {
        missao.iniciar(personagem);
    }

    public void completarMissao(Missao missao, Personagem personagem) {
        missao.completar(personagem);
    }

    public void ataquePersonagem(Personagem personagem, Inimigo inimigo) {
        personagem.atacar(inimigo);
    }

    public void ataqueInimigo(Inimigo inimigo, Personagem personagem) {
        inimigo.atacar(personagem);
    }

    public void caminharPersonagem(Personagem personagem) {
        personagem.caminhar(7, 15);
    }

    public void pegarItemPersonagem(Personagem personagem, Item item) {
        personagem.pegarItem(item);
    }

    public void usarHabilidadePersonagem(Personagem personagem, Habilidade habilidade) {
        personagem.usarHabilidades(habilidade);
    }

    public void usarItemPersonagem(Personagem personagem, Item item) {
        personagem.usarItem(item);
    }
}
