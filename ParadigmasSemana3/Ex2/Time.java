package ParadigmasSemana3.Ex2;

public class Time {

    //Atributos
    private int hour;
    private int minute;

    //Construtor padrão
    public Time(){
        this.setHour(0);
        this.setMinute(0);
    }

    //Construtor que recebe valores por parâmetro
    public Time(int initialHour, int initialMinute){
        this.setHour(initialHour);
        this.setMinute(initialMinute);
    }

    //Construtor que inicia apenas a hora por parâmetro
    public Time(int newHour){
        this.setHour(newHour);
        this.setMinute(0);
    }

    //Métodos get/set
    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public void setHour(int hour){
        if(hour >= 0 && hour <= 23)
            this.hour = hour;
        else{
            System.out.println("Somente horas <= 23 são aceitas");
        }
    }

    public void setMinute(int minute){
        if(minute >= 0 && minute <= 59)
            this.minute = minute;
        else{
            System.out.println("Somente minutos <= 59 são aceitos");
        }
    }

    //Outros métodos
    public boolean anterior(int hour, int minute){
        if((hour > getHour()) || ((hour == getHour()) && (minute > getMinute())))
            return true;
        else
            return false;
    }

    public boolean posterior(int hour, int minute){
        if((hour < getHour()) || ((hour == getHour()) && (minute < getMinute())))
            return true;
        else
            return false;
    }

    public boolean equals(int hour, int minute){
        if(hour == getHour() && minute == getMinute())
            return true;
        else
            return false;
    }

    public String toString(){
        return String.format("%02d:%02d", getHour(), getMinute());
    }
}
