package ParadigmasSemana6.ex4;

import java.util.*;

public class Principal {
    
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        Professor prof1 = new Professor(6, "Todt");
        Professor prof2 = new Professor(7, "Castilho");
        Professor prof3 = new Professor(3, "Rachel");
        Professor prof4 = new Professor(9, "Almeida");
        Professor prof5 = new Professor(21, "Vignatti");

        Collection <Professor> prof = new LinkedList<Professor>();

        prof.add(prof1);
        prof.add(prof2);
        prof.add(prof3);
        prof.add(prof4);
        prof.add(prof5);

        System.out.println("=====Lista Antes da Remoção=====");
        Iterator<Professor> i = prof.iterator();
        while(i.hasNext()){
            Professor p = i.next();
            System.out.println("Matrícula: " + p.getMatricula() + " Nome: " + p.getNome());
        }

        int matriculaToRemove = scan.nextInt();
        Iterator<Professor> j = prof.iterator();
        while(j.hasNext()){
            Professor p = j.next();
            if(p.getMatricula() == matriculaToRemove)
                j.remove();
        }

        System.out.println("=====Lista Após Remoção=====");
        Iterator<Professor> k = prof.iterator();
        while(k.hasNext()){
            Professor p = k.next();
            System.out.println("Matrícula: " + p.getMatricula() + " Nome: " + p.getNome());
        }

        scan.close();
    }
}
