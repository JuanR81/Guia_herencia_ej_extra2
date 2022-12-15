package Entidad;

import java.util.Scanner;

public class EdificioDeOficinas extends Edificio {

    Scanner leer = new Scanner(System.in);

    private int oficinas, personas, pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int oficinas, int personas, int pisos) {
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(int oficinas, int personas, int pisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio de " + getClass() + " es " + (largo * ancho));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio de " + getClass() + " es " + (largo * ancho * alto));
    }

    public void cantPersonas() {

        System.out.println("Ingrese la cantidad de personas que entran por oficina");
        personas = leer.nextInt();
        System.out.println("Ingrese la cantidad de oficinas que hay en cada piso");
        oficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos que tiene el edificio");
        pisos = leer.nextInt();

        int personasPorPiso = personas * oficinas;
        int totalPersonas = personasPorPiso * pisos;
        System.out.println("La cantidad de personas que entran en cada piso de " + getClass() + " es " + personasPorPiso);
        System.out.println("La cantidad de personas que entran en el edificio de " + getClass() + " es " + totalPersonas);
    }

}
