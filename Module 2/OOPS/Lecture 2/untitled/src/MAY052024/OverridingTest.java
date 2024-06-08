class Jungle{
    protected void makeNoise(){
        System.out.println("Jungle sound ");
    }
}
 class Cat extends Jungle {
     public void makeNoise(){
         System.out.println("meow meow ");
     }
}

public class OverridingTest{
    public static void main(String[] args) {
Cat c1=new Cat();
        System.out.print("Child object"+ " ");
        c1.makeNoise();

        Jungle jungle =new Jungle();
        System.out.print("PArent object"+ " ");
        jungle.makeNoise();

        Jungle parent= new Cat();
        parent.makeNoise();

    }
}
