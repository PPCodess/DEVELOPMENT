package MAY052024;
/*

public class Staticvarible {
    static int a=10;
    public static void main(String[] args) {
        System.out.println(a);
    }
    public void Demo(){
        System.out.println(Staticvarible.a);
    }
}

class B {
    public void Demo() {
        System.out.println(Staticvarible.a);
//If we remove class name its not accesible here
//So to acces it here we have two methods
//1. MAke its object
        //Staticvarible obj=new Staticvarible();
        //System.out.println(obj.a);

//best practise is to acces using class name
    }
}
*/
public class Staticvarible {
    static int a=10;
    public static void main(String[] args) {
        Staticvarible obj=new Staticvarible();
        System.out.println(obj.a); //10
        obj.a=100; //100
        System.out.println(obj.a);

        Staticvarible obj1=new Staticvarible();
        obj1.a=333;
        System.out.println(obj1.a);

        System.out.println(obj.a);

    }
}