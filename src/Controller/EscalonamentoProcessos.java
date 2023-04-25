package Controller;

import Biblioteca.FilaObject.Fila;
import Model.Processo;

public class EscalonamentoProcessos {
    public EscalonamentoProcessos(){
        super();
    }

    public void RoundRobin(Fila fila){
        while (!fila.isEmpty()) {
            Processo processo = null;
            try {
                processo = (Processo) fila.remove();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                processo.decrementarTempo();
                if (processo.getTempo() > 1){
                    fila.insert(processo);
                    System.out.println("O processo "+ processo.getNome() +" ainda está rodando - Tempo restante: "+ processo.getTempo());
                }
                else {
                    System.out.println("O processo "+ processo.getNome() +" terminou de rodar.");
                }
            }

        }

    }


}
