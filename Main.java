public class Main {

    public static void main(String[] args){

        coche miCoche = new coche();
        miCoche.AumentarPuerta();
        System.out.println(miCoche.puertas);

        suma(20, 20, 12);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
class coche {
    public int puertas = 4;

    public void AumentarPuerta(){
        this.puertas++;
    }
}


