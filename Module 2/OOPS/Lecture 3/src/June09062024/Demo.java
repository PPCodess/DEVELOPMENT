package June09062024;

class Test {
    Test() {
        System.out.println("Main Test huuu");
    }
}

public class Demo extends Test {
    int a;

    Demo() {
        this(10); // Calls the parameterized constructor of Demo
        System.out.println("Child ................");
    }

    // Parameterized constructor
    public Demo(int i) {        //argument constructor

        System.out.println("Arg ");
    }

    public static void main(String[] args) {
        Demo d2 = new Demo();
    }
}
