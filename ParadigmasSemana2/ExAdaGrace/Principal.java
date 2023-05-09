public class Principal { 
    public static void main(String[] args){
        Pessoa pessoa[] = new Pessoa[2];
        pessoa[0] = new Pessoa();
        pessoa[1] = new Pessoa();

        pessoa[0].birth[0].ajustarData(10, 12, 1815);
        pessoa[1].birth[1].ajustarData(9, 12, 1906);

        pessoa[0].calcularIdade(0);
        pessoa[1].calcularIdade(1);
        
        System.out.print("Nome: " + pessoa[0].retornarNome(0) + " Idade: " + pessoa[0].retornarIdade() + " Nascimento: ");
        pessoa[0].birth[0].imprimirData();

        System.out.print("Nome: " + pessoa[1].retornarNome(1) + " Idade: " + pessoa[1].retornarIdade() + " Nascimento: ");
        pessoa[1].birth[1].imprimirData();
     }
}
