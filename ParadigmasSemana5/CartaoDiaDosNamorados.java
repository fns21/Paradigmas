public class CartaoDiaDosNamorados extends CartaoWeb{

    //Construtor
    public CartaoDiaDosNamorados(String destinatario){
        super(destinatario);
    }

    //Outros métodos
    public String retornarMensagem(String remetente){
        String msg = "Querida "+ destinatario +", Feliz Dia dos Namorados! Espero que esse tenha sido o único cartão do dia dos namorados que tenha ganhado nessa data! De todo meu coração, " + remetente;
        return msg;
    }
}
