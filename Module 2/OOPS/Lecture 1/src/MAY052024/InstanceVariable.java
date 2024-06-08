package MAY052024;

public class InstanceVariable {
    int a=10;
    int b;
    public static void main(String[] args) {
        InstanceVariable instance1=new InstanceVariable();
        System.out.println(instance1.a);
        System.out.println(instance1.b);

        instance1.a=100;
        instance1.b=900;
        System.out.println(instance1.a);
        System.out.println(instance1.b);

        InstanceVariable instance2=new InstanceVariable();
        instance2.a=43;
        instance2.b=409;
        System.out.println(instance2.a);
        System.out.println(instance2.b);

    }

}

