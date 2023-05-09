package ParadigmasSemana3.Ex3;

public class Data {
    
    //Atributos
    private int dia, mes, ano;

    //Construtores
    public Data(){
        this.setDia(1);
        this.setMes(1);
        this.setAno(1);
    }

    public Data(int dia, int mes, int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public Data(int dia, int mes){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(1);
    }

    public Data(int dia){
        this.setDia(dia);
        this.setMes(1);
        this.setAno(1);
    }

    //Métodos get/set
    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public void setDia(int dia){
        if(dia >= 1 && dia <= 31)
            this.dia = dia;
    }

    public void setMes(int mes){
        if(mes >= 1 && mes <= 12)
            this.mes = mes;
    }

    public void setAno(int ano){
        if(ano >= 1)
            this.ano = ano;
    }

    //Outros Métodos
    public boolean anterior(Data data){
        if(data.ano > getAno() || (data.ano == getAno() && data.mes > getMes()) || (data.ano == getAno() && data.mes == getMes() && data.dia > getDia()))
            return true;
        else
            return false;
    }

    public boolean posterior(Data data){
        if(data.ano < getAno() || (data.ano == getAno() && data.mes < getMes()) || (data.ano == getAno() && data.mes == getMes() && data.dia < getDia()))
            return true;
        else
            return false;
    }

    public boolean equals(Data data){
        if(data.ano == getAno() && data.mes == getMes() && data.dia == getDia())
            return true;
        else
            return false;
    }

    public String toString(){
        return String.format("%02d/%02d/%04d", getDia(), getMes(), getAno());
    }
}
