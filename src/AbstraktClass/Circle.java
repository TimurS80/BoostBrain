package AbstraktClass;

public class Circle implements Shape {
    private double radius;
    private String color;
        public Circle(double r, String c) {
        radius = r;
        color = c;
        }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return  radius*radius*3.14;
    }

    @Override
    public String getColor() {
        return color;
    }
}
