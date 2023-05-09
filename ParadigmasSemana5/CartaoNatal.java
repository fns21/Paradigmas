public class CartaoNatal extends CartaoWeb{
    
    //Construtor
    public CartaoNatal(String destinatario){
        super(destinatario);
    }

    //Outros métodos
    public String retornarMensagem(String remetente){
        String msg = "Querida "+ destinatario +", Feliz Natal! Que esta data seja repleta de amor, paz e alegria. Que o espírito natalino ilumine seus dias e traga muitas bênçãos. Com todo o meu carinho e votos de um Natal especial, " + remetente;
        return msg;
    }
}
