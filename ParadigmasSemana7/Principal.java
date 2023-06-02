package ParadigmasSemana7;

import java.util.*;

public class Principal {
    public static void main(String args[]){
        ProdutoEletronico cel = new Celular();
        ProdutoEletronico tv = new Televisao();
        Servico servico = new Servico("Presencial", 27);

        Collection<Loja> loja = new LinkedList<Loja>();

        loja.add(cel);
        loja.add(tv);
        loja.add(servico);

        for(Loja l : loja){
            l.acionarGarantia();
            l.vender();
            if(l instanceof ProdutoEletronico){
                ProdutoEletronico prod = (ProdutoEletronico) l;
                prod.ligar(prod);
                prod.desligar(prod);
            }
        }
    }
}
