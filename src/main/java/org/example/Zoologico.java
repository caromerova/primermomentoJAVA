package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        animal1.nombre="CABALLO";
        animal1.genero="M";


        Animal animal2 = new Animal();
        animal2.nombre="CEBRA";
        animal2.genero="F";


        animal1.encontrarPareja(animal2); //Un animal consigue pareja


        Familia familia = new Familia(animal1,animal2);


        familia.tenerHijo("CEBRALLO");


        familia.imprimirFamilia();
    }
}