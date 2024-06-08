public class Papa {
    public static void main(String[] args) {
        //To call ranveer of Animal class
        Animal animal=new Animal();
        animal.ranveer();
        animal.rashmika();  //function called
        //methods which require parametres
        System.out.println();
        System.out.println("------------Object with para---------");
        String gemini = animal.ranveer("Arjun"); //ctrl+alt+v
        System.out.println(gemini);
    }
}
