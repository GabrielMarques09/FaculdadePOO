
package acao;


public abstract class PostoxConvenienca {

   
    private String nomeCombustivel;
    private double valorCombustivel;
    private double lanche;
    private double bebidas;
    private double acessorios;
    private double outros;
    private double litros;
    
    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    
    public void setNomeCombustivel(String nomeCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
    }
    
    public double getValorCombustivel() {
        return valorCombustivel;
    }

    /**
     * @param valorCombustivel the valorCombustivel to set
     */
    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    
    
    public double getLitros() {
        return litros;
    }

    
    public void setLitros(double litros) {
        this.litros = litros;
    }

    
    
    

    
    public double getLanche() {
        return lanche;
    }

    
    public void setLanche(double lanche) {
        this.lanche = lanche;
    }

    
    public double getBebidas() {
        return bebidas;
    }

   
    public void setBebidas(double bebidas) {
        this.bebidas = bebidas;
    }

   
    public double getAcessorios() {
        return acessorios;
    }

   
    public void setAcessorios(double acessorios) {
        this.acessorios = acessorios;
    }

    
    public double getOutros() {
        return outros;
    }

    
    public void setOutros(double outros) {
        this.outros = outros;
    }
    
    
    
}
