import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {
    //atributos
    private Carta[] cartas;

    public Baraja(){
        //recordad que values() devuelve el enum como un array
        cartas = new Carta[Palo.values().length*Numero.values().length];
        int posicion=0;
        for(Palo palo:Palo.values()) {
            for (Numero numero : Numero.values()) {
                cartas[posicion++] = new Carta(palo, numero);
                //posicion++ <-- lo pongo arriba
            }
        }
        barajar();
    }

    private void barajar(){
        List<Carta> listaCartas = Arrays.asList(cartas);
        Collections.shuffle(listaCartas);
        listaCartas.toArray(cartas);
    }

    public Carta repartirEncima(){
        Carta carta = null;
        if(cartas.length>0){
            carta = cartas[0];
            cartas = Arrays.copyOfRange(cartas,1,cartas.length);
        }
        return carta;
    }

    @Override
    public String toString(){
        return Arrays.toString(cartas);
    }

}
