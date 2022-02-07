package AbstraktClass;

import java.util.ArrayList;

public class Absracts {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<> ();
       Shape shape = new Circle(1, "Red");
       shapes.add(shape);
       shapes.add(new Rectangle (2, 4, "Black"));
       printShapes(shapes);
    }

    public static void printShapes(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {

        System.out.println("Name= " + shape.getName());
        System.out.println("Square= " + shape.getSquare());
        System.out.println("Color= " + shape.getColor());
    }

}
}
