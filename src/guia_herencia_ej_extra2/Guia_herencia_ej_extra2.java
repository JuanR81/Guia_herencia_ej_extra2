package guia_herencia_ej_extra2;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

public class Guia_herencia_ej_extra2 {

    public static void main(String[] args) {

        Edificio poli1 = new Polideportivo("El Poli", true, 10, 5, 30);
        Edificio poli2 = new Polideportivo("El Poli2", false, 15, 0, 50);
        Edificio ofi1 = new EdificioDeOficinas(0, 0, 0, 20, 20, 40);
        Edificio ofi2 = new EdificioDeOficinas(0, 0, 0, 15, 28, 50);

        ArrayList<Edificio> edificios = new ArrayList();

        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(ofi1);
        edificios.add(ofi2);

        int techo = 0;
        int sinTecho = 0;

        for (Edificio aux : edificios) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
        }
        for (Edificio aux : edificios) {
            if (aux instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) aux;
                if (((Polideportivo) aux).isTechado()) {
                    techo++;
                } else {
                    sinTecho++;
                }
            }

            if (aux instanceof EdificioDeOficinas) {
                EdificioDeOficinas object = (EdificioDeOficinas) aux;
                ((EdificioDeOficinas) aux).cantPersonas();
            }

        }
        System.out.println("La cantidad de Polideportivos techados es " + techo);
        System.out.println("La cantidad de Polideportivos no techados es " + sinTecho);
    }
}
