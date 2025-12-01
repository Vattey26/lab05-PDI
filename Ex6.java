class Rectangle
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }
}

class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getSurface()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

public class Ex6 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(4, 8);
        Circle c = new Circle(5);

        System.out.printf("Rectangle area = %.2f\n", r.getArea());
        System.out.printf("Rectangle perimeter = %.2f\n", r.getPerimeter());

        System.out.println();

        System.out.printf("Circle surface = %.2f\n", c.getSurface());
        System.out.printf("Circle perimeter = %.2f\n", c.getPerimeter());
    }
}
