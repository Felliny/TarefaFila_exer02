package View;

import Biblioteca.FilaObject.Fila;
import Controller.EscalonamentoProcessos;
import Model.Processo;

public class Main {
    public static void main(String[] args) {
        Fila fila= new Fila();

        fila.insert(new Processo("notepad.exe", 14));
        fila.insert(new Processo("write.exe", 24));
        fila.insert(new Processo("google", 42));
        fila.insert(new Processo("opera", 33));
        fila.insert(new Processo("minecraft", 66));
        fila.insert(new Processo("discord", 10));


        EscalonamentoProcessos escalonador= new EscalonamentoProcessos();

        escalonador.RoundRobin(fila);
    }
}
