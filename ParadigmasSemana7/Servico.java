package ParadigmasSemana7;

public class Servico implements Loja{
    
    //Atributos
    private String formato;
    private int min;

    //Construtor
    public Servico(String formato, int min){
        this.setFormato(formato);
        this.setMin(min);
    }

    //Métodos get/set
    public String getFormato(){
        return this.formato;
    }

    public int getMin(){
        return this.min;
    }

    public void setFormato(String formato){
        this.formato = formato;
    }

    public void setMin(int min){
        if(min >= 0)
            this.min = min;
    }

    //Outros métodos
    public void acionarGarantia(){
        System.out.println("Acionando Garantia do Serviço!");
    }

    public void vender(){
        System.out.println("Vendendo Serviço!");
    }
}
