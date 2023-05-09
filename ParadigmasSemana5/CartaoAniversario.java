public class CartaoAniversario extends CartaoWeb{

    //Construtor
    public CartaoAniversario(String destinatario){
        super(destinatario);
    }

    //Outros métodos
    public String retornarMensagem(String remetente){
        String msg = "Querida "+ destinatario +", Feliz Aniversário! Desejo que este seja o único cumprimento de aniversário que você receba hoje! Com todo o meu carinho e afeto, " + remetente;
        return msg;
    }
    
}
