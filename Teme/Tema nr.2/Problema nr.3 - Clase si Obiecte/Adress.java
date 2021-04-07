package com.company;

public class Adress {
    private int numar;
    private String strada, oras;
    public Adress(){
        this.numar = 0;
        this.strada = "N-a fost introdusa o strada";
        this.oras = "N-a fost introdus un oras";
    }
    public Adress(int numar, String strada, String oras){
        this.numar = numar;
        this.strada = strada;
        this.oras = oras;
    }
    public String getAdresa()
    {
        return strada + " " + oras;
    }
    public String getAdresaCompleta()
    {
        return strada + " " + numar + ", " + oras;
    }
    public String toString() {
        return getAdresaCompleta();
    }

}