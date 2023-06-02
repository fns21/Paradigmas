package ParadigmasSemana6.ex4;

public class Professor {
    
    //Atributos
    private int matricula;
    private String nome;

    //Construtor
    public Professor(int matricula, String nome){
        this.setMatricula(matricula);
        this.setNome(nome);
    }

    //Métodos get/set
    public int getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
