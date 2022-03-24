package local.uninga.ads.revisao4;

public class Cliente {

    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
   }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + " }";
    }

    @Override
    public boolean equals(Object obj) {
        return ((Cliente)obj).codigo==this.codigo;
    }

}
