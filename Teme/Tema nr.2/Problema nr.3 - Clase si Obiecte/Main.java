package com.company;

public class Main {

    public static void main(String[] args) {
        Adress adresaRP = new Adress(823, "Bvd.Magheru", "Bucuresti");
        PaymentMethod plataRP = new PaymentMethod("Card bancar");
        Customer Radu = new Customer(22, "Pestrea", "Radu", adresaRP, plataRP);
        System.out.println(Radu);
        System.out.println(Radu.getAdresa());
        System.out.println(Radu.getMetodaDePlata());
        System.out.println(Radu.getNumeComplet());
    }
}
