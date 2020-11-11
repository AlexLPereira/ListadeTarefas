package com.example.listadetarefas;

import java.io.Serializable;

public class Tarefa implements Serializable, Comparable<Tarefa> {
    public static final String TAG = "Tarefa";
    private String id;
    private String tarefa;
    private boolean feita;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

    @Override
    public int compareTo(Tarefa tarefa) {
        return this.tarefa.compareTo(tarefa.getTarefa());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id='" + id + '\'' +
                ", tarefa='" + tarefa + '\'' +
                ", feita=" + feita +
                '}';
    }
}
