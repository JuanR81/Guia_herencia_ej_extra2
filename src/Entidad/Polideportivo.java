package Entidad;

public class Polideportivo extends Edificio {

    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo(String nombre, boolean techado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
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
        System.out.println("La superficie de " + getNombre() + " es " + (largo * ancho));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen de " + getNombre() + " es " + (largo * ancho * alto));
    }

}
