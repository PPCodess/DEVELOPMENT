package June09062024;

class A{
    String  city;
}
class B extends  A{
    String city;
      void print(){
       super.city="Delhi";
       city="Agra";
          System.out.println("Parent city " + super.city + " Child city "+ this.city);
      }
}
public class Superr extends A {
    public static void main(String[] args) {
    B b1=new B();
    b1.print();

    }
}