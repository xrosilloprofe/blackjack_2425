public class Carta {
    //atributos
    private Palo palo;
    private Numero numero;

    //constructor
    public Carta(Palo palo, Numero numero){
        this.numero=numero;
        this.palo=palo;
    }

    //getters
    public Numero getNumero(){ return numero;}
    public Palo getPalo(){return palo;}

    @Override
    public String toString(){
        return numero.toString()+palo.toString();
    }

}
