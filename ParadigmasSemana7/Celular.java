package ParadigmasSemana7;

public class Celular extends ProdutoEletronico{
    
    //Construtor
    public Celular(){
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
