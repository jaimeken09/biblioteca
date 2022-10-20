package com.jmperezra.pccomponentes;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());
    }
}
