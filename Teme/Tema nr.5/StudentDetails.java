package com.company;

import java.util.ArrayList;

public class StudentDetails {

    private String prenume;
    private String nume;
    private ArrayList<Double> noteMatematica;
    private ArrayList<Double> noteRomana;

    public StudentDetails(String prenume, String nume, ArrayList<Double> noteMatematica, ArrayList<Double> noteRomana) {
        this.prenume = prenume;
        this.nume = nume;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
    }

    public String getPrenume() {
        return prenume;
    }


    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }


    public String getNume() {
        return nume;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }


    public ArrayList<Double> getNoteMatematica() {
        return noteMatematica;
    }


    public void setNoteMatematica(ArrayList<Double> noteMatematica) {
        this.noteMatematica = noteMatematica;
    }


    public ArrayList<Double> getNoteRomana() {
        return noteRomana;
    }


    public void setNoteRomanat(ArrayList<Double> noteRomana) {
        this.noteRomana = noteRomana;
    }

    @Override
    public String toString() {
        return "Prenume: " + prenume + "\n" + "Nume: " + nume + "\n" +
                "Note Matematica: " + noteMatematica + "\n" + "Note romana: " + noteRomana + "\n";
    }

}