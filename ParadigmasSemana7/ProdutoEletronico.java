package ParadigmasSemana7;


public abstract class ProdutoEletronico implements Loja{

    //Atributos
    private String fabricante;
    private float peso;
    private String marca;

    //Construtor
    public ProdutoEletronico(){}

    public ProdutoEletronico(String fabricante, float peso, String marca){
        this.setFabricante(fabricante);
        this.setPeso(peso);
        this.setMarca(marca);
    }

    //Métodos get/set
    public String getFabricante(){
        return this.fabricante;    
    }

    public float getPeso(){
        return this.peso;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setPeso(float peso){
        if(peso >= 0)
            this.peso = peso;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void ligar(ProdutoEletronico prod){

        if(prod instanceof Celular){
            System.out.println("Ligando Celular");
        }
        else
            System.out.println("Ligando Televisão");
    }

    public void desligar(ProdutoEletronico prod){

        if(prod instanceof Celular){
            System.out.println("Desligando Celular");
        }
        else
            System.out.println("Desligando Televisão");
    }

}
