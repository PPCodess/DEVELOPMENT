 class Parent {
    String name;

    Parent(String n){
        // this.name=n;
        //  this measn current class ka  object
        //as we are in the class only can also write like
        //instead of  this.name=n;
        name=n;

    }

}
public class Child extends Parent{

String name;

    Child(String n1,String n2) {
        super(n1);
        this.name=n2;
    }
    void print(){
        System.out.println(super.name + " " + name);
    }

    public static void main(String[] args) {
        Child c1=new Child("Parent","Child");
        c1.print();
    }
}


