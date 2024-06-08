class Gadi{
    Gadi manufracture(){
        System.out.println(" Gadi leleo");

    return new Gadi(); //object is returned
}
}
class Ford extends Gadi{
    @Override
    String  manufracture() {
        System.out.println("Ford ki gaddi ");
        return new Ford();
    }
}

public class Coavraint {
    public static void main(String[] args) {

    }

}
