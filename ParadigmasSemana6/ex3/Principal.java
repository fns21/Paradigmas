package ParadigmasSemana6.ex3;

import java.util.*;

public class Principal {
    
    public static void main(String args[]){
        AlunoMonitor alunoMon3 = new AlunoMonitor("Thales", 20211781, "Cl182"); 
        AlunoMonitor alunoMon2 = new AlunoMonitor("Joao", 20211792, "Cl182");
        AlunoMonitor alunoMon1 = new AlunoMonitor("Fábio", 20211782, "Cl1062");


        Collection<AlunoMonitor> alunoMon = new TreeSet<AlunoMonitor>();

        alunoMon.add(alunoMon1);
        alunoMon.add(alunoMon2);
        alunoMon.add(alunoMon3);

        Iterator<AlunoMonitor> i = alunoMon.iterator();
        while(i.hasNext()){
            AlunoMonitor aluno = i.next();
            System.out.println("Nome: " + aluno.getNome() + " Matrícula: " + aluno.getMatricula() + " Código da Disciplina: " + aluno.getCodDis());
        }
    }
}
