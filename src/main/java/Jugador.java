import java.time.LocalDate;
import java.util.Arrays;

public class Jugador {
    //atributos
    private String nombre;
    private LocalDate fechaNacimiento;
    private Carta[] mano;

    //
    public Jugador(String nombre, LocalDate fechaNacimiento){
        mano = new Carta[0];
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public void anyadirCarta(Carta carta){
        mano = Arrays.copyOf(mano,mano.length+1);
        mano[mano.length-1] = carta;
    }

    public int obtenerPuntuacion(){
        //contar a partir de las cartas de la mano y devolver la puntuación
        int puntos=0;
        for(Carta carta:mano){
            puntos += carta.getNumero().getPuntuacion();
        }
//        if(puntos>21)
//            return -1;
//        return puntos;
        return (puntos>21)?-1:puntos;
    }

    @Override
    public String toString(){
        //devolver nombre + puntuación + mano
        return "Jugador: "  + nombre + " puntuación: " + obtenerPuntuacion() +
                " mano: " + Arrays.toString(mano);
    }

}
