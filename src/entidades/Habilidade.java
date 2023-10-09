package entidades;

public class Habilidade {

    private String nome;
    private String descricao;
    private Integer custoEnergia;

    public Habilidade() {
    }

    public Habilidade(String nome, String descricao, Integer custoEnergia) {
        this.nome = nome;
        this.descricao = descricao;
        this.custoEnergia = custoEnergia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCustoEnergia() {
        return custoEnergia;
    }

    public void setCustoEnergia(Integer custoEnergia) {
        this.custoEnergia = custoEnergia;
    }
}
