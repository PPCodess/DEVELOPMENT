class Shape {
    void draw(){
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing Rectangle");
    }
}

public class OverridingShapeTest{
    public static void main(String[] args) {
Shape shape=new Shape();
shape.draw();


Circle circle=new Circle();
circle.draw();

Rectangle rectangle=new Rectangle();
rectangle.draw();

Shape shape1=new Circle();
Shape shape2=new Rectangle();
shape1.draw();
shape2.draw();
//Circle c1 =new Shape();

    }
}