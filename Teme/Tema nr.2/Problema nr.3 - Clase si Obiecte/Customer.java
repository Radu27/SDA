package com.company;

public class Customer {
    private int ani;
    private String nume, prenume;
    private Adress adresa;
    private PaymentMethod metodaDePlata;

    public Customer(){
        this.nume = "Date";
        this.prenume = "Neintroduse";
        this.ani = 0;
    }
    public Customer(int ani, String nume, String prenume, Adress adresa, PaymentMethod metodaDePlata)
    {
        this.ani = ani;
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.metodaDePlata = metodaDePlata;
    }
    public String getNume()
    {
        return this.nume;
    }
    public String getPrenume()
    {
        return this.prenume;
    }
    public String getNumeComplet()
    {
        return (nume + " " + prenume);
    }
    public int getAni()
    {
        return this.ani;
    }
    public Adress getAdresa()
    {
        return this.adresa;
    }
    public PaymentMethod getMetodaDePlata()
    {
        return this.metodaDePlata;
    }
    public String toString() {
        return "Client: "  + nume + " " + prenume + " Ani: " + ani + " Adresa: " + this.adresa.getAdresaCompleta() + " Metoda de plata: " + this.metodaDePlata.getPaymentMethod();

    }

}