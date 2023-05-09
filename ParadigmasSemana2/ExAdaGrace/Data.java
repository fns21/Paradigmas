public class Data {
    
    int dia;
    int mes;
    int ano;

    public void ajustarData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimirData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
