package AbstraktClass;

public class Rectangle implements Shape{
    private double height;
    private double width;
    private String color;

    public  Rectangle (double h, double w, String c) {
        height = h;
        width = w;
        color = c;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return height*width;
    }

    @Override
    public String getColor() {
        return color;
    }
}
