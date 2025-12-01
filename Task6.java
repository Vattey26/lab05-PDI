import java.util.Scanner;
    class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       boolean t = true;
        while (true) {
            System.out.println("Option:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Exit Programming");
            System.out.println("Choose: ");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                     System.out.println("Enter Width: ");
                     double w = input.nextDouble();
                
                      System.out.println("Enter height : ");
                      double h = input.nextDouble();
                     Rectangle r = new Rectangle(w, h);
                      System.out.println("Rectangle Area: " + r.getArea());
                     System.out.println("Rectangle Perimeter: " + r.getPerimeter());
                    break;
                    case 2:
                         System.out.println("Enter Radius : ");
                     double rad = input.nextDouble();
                
                     Circle c = new Circle(rad);
                     System.out.println("Circle Surface: " + c.getSurface());
                     System.out.println("Circle Perimeter: " + c.getPerimeter());
                     break;
                    case 3:
                        System.out.println("Exit Programming.....");
                    t = false;
                    break;
                default:
                    System.out.println("invalid choose!");
                    break;
            }
            
        }

    }
        
}

