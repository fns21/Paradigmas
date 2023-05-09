public class Pessoa{
    final int ANO_ATUAL = 2023;
    final int MES_ATUAL = 3;
    final int DIA_ATUAL = 31;

    Data birth[] = new Data[2];
    String nome;
    int idade;

    public Pessoa(){
        birth[0] = new Data();
        birth[1] = new Data();
    }
    
    public String retornarNome(int ID){
        if (ID == 0)
            this.nome = "Ada Lovelace";
        else
            this.nome = "Grace Hopper";
        return this.nome;
    }

    public int retornarIdade(){
        return this.idade;
    }

    public void calcularIdade(int ID){

        if(birth[ID].mes < MES_ATUAL && birth[ID].dia < DIA_ATUAL)
            this.idade = ANO_ATUAL - birth[ID].ano;
        else
            this.idade = ANO_ATUAL - birth[ID].ano - 1;            
    }
}