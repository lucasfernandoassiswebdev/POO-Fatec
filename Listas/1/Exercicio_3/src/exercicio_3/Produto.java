package exercicio_3;

public class Produto {

    public Produto() {
    }

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.trataQtde(qtde);
        this.trataPreco(preco);
    }

    private int id;
    private String descricao;
    private int qtde;
    private float preco;

    public void comprar(int x) {
        this.qtde += x;
    }

    public void vender(int x) {
        this.qtde -= x;
    }

    public void subir(float x) {
        this.preco += x;
    }

    public void descer(float x) {
        this.preco -= x;
    }

    public String mostra() {
        return "Id do Produto: " + this.id
                + "\nDescrição: " + this.descricao
                + "\nQuantidade: " + this.qtde
                + "\nPreço: " + this.preco + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        trataQtde(qtde);
    }

    public void trataQtde(int qtde) {
        if (qtde > 0) {
            this.qtde = qtde;
        }

        System.out.println("Quantidade deve ser maior que 0");
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        trataPreco(preco);
    }

    public void trataPreco(float preco) {
        if (preco > 0) {
            this.preco = preco;
        }

        System.out.println("Preço deve ser maior que 0");
    }
}
