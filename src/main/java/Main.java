public class Main {
    public static void main(String[] args) {
        //Jugadores máximo 6
        int numJugadores = 0;
        while(numJugadores<1 || numJugadores>6){
            numJugadores = Input.getInteger("¿Cuántos jugadores?");
        }

        Juego juego = new Juego();
    }
}
