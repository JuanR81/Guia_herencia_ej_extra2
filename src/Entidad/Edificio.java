package Entidad;

public abstract class Edificio {

    protected int ancho, alto, largo;

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();
}
