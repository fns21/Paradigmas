public abstract class CartaoWeb{

    //Atributos
    protected String destinatario;

    //Construtores
    public CartaoWeb(){}

    public CartaoWeb(String destinatario){
        this.setDestinatario(destinatario);
    }

    //Métodos get/set
    public String getDestinatario(){
        return this.destinatario;
    }

    public void setDestinatario(String newDestinatario){
        this.destinatario = newDestinatario;
    }

    //Outros métodos
    public abstract String retornarMensagem(String remetente);
}