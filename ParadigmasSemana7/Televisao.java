package ParadigmasSemana7;

public class Televisao extends ProdutoEletronico{
    
    //Construtor 
    public Televisao(){
        super();
    }

    //Outros métodos
    @Override
    public void acionarGarantia(){
        System.out.println("Acionando Garantia do Produto!");
    }
    
    @Override
    public void vender(){
        System.out.println("Vendendo Produto!");
    }
    
}
