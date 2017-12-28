package loiane.Aula43.labs2;

/**
 *
 * @author Christian
 */
public abstract class Pessoa {
    
    protected String nome;
    protected double rendaBruta;
    protected double rendaLiquida;
    protected double imposto;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaMensal() {
        return rendaBruta;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaBruta = rendaMensal;
    }
    
    public abstract void calcularImposto();
    
    
}
