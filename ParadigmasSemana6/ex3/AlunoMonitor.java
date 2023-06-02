package ParadigmasSemana6.ex3;

public class AlunoMonitor implements Comparable<AlunoMonitor>{
   
    //Atributos
    private String nome;
    private String codDis; 
    private int matricula;

    //Construtor
    public AlunoMonitor(String nome, int matricula, String codDis){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setCodDis(codDis);
    }

    //Métodos get/set
    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public String getCodDis(){
        return this.codDis;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setCodDis(String codDis){
        this.codDis = codDis;
    }

    //Outros métodos
    public int compareTo(AlunoMonitor alunoMon){
        return getNome().compareTo(alunoMon.nome);
    }
}
