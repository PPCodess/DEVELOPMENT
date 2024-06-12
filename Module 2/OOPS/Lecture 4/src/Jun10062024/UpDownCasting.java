package Jun10062024;
class Parent{
    void display(){
        System.out.println("THis is the parent class");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("THis is the child class");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        //object of type parent and also stored the object of parent

        Parent p= new Parent();
        p.display();

        p=(Parent) new Child();//This is upcasting
        //Here object is of child class
        p.display();

        //object of type parent and also stored the object of parent

        Child c=(Child) p;  //This is downcasting
        c.display();

        // Child e=(Parent) new Child();
        //This is giving error because after typecast happens there
        //should be Parent type varible to hold the PArent type objec t
    }



}

