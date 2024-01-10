package lab4;

public class Rectangle {
    // Proprietăți
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Getter și setter pentru width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter și setter pentru length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Metoda pentru calculul ariei
    public double calculateArea() {
        return width * length;
    }

    // Metoda pentru calculul perimetrului
    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    public static void main(String[] args) {
        // Exemplu de utilizare
        Rectangle myRectangle = new Rectangle(5.0, 10.0);

        // Afișare proprietăți
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Length: " + myRectangle.getLength());

        // Afișare arie și perimetru
        System.out.println("Aria: " + myRectangle.calculateArea());
        System.out.println("Perimetru: " + myRectangle.calculatePerimeter());

        // Modificare proprietăți
        myRectangle.setWidth(7.0);
        myRectangle.setLength(12.0);

        // Afișare arie și perimetru după modificare
        System.out.println("Aria dupa modificare: " + myRectangle.calculateArea());
        System.out.println("Perimetru dupa modificare: " + myRectangle.calculatePerimeter());
    }
}
