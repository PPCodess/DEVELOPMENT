package Jun10062024;

public class Typecasting {
    public static void main(String[] args) {
        //widening implicit typecasting
        int num=10;
        System.out.println("The int value is "+num);
        //converting from int to double
        double d=num;
        System.out.println("The double value is " +d);

    //narrowing eplicit typecasting
     double data=10.55;
        System.out.println("The double value is "+data);
        //coonvertionf double ot integer
        int intdata=(int) data;
        System.out.println("The int data "+ intdata);
    }

}
