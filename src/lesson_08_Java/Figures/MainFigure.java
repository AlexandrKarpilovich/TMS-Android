package lesson_08_Java.Figures;

/**
 * Write a hierarchy of classes "Shapes".
 * Shape -> Triangle -> Rectangle -> Circle.
 * Implement area calculation function for each shape type and perimeter calculation.
 * Create an array of 5 shapes.
 * Display the sum of the perimeters of all shapes in the array.
 */
public class MainFigure {
    public static void main(String[] args) {

        // Create a triangle object and set dimensions
        Triangle triangle = new Triangle();
        triangle.setTriangleFirstSide(2);
        triangle.setTriangleSecondSide(2);
        triangle.setTriangleBase(3);
        triangle.setTriangleHeight(1);

        // Create a rectangle object and set dimensions
        Rectangle rectangle = new Rectangle();
        rectangle.setRectangleLength(3);
        rectangle.setRectangleWidth(4);

        // Create a circle object and set dimensions
        Circle circle = new Circle();
        circle.setDiameter(5);

        // Create a hexagon object and set dimensions
        Hexagon hexagon = new Hexagon();
        hexagon.setHexagonSide(6);

        // Create a rhombus object and set dimensions
        Rhombus rhombus = new Rhombus();
        rhombus.setRhombusSide(7);
        rhombus.setRhombusHeight(4);

        // Create an array of shapes
        SomeFigure[] figures = new SomeFigure[]{triangle, rectangle, circle, hexagon, rhombus};

        // Create a variable for the sum of the perimeters
        double sumOfPerimeters = 0;

        // Loop through the elements of the array and calculate the sum of the perimeters of the shapes
        for (SomeFigure figure : figures) {
            sumOfPerimeters += figure.perimeter();
        }

        // Displaying information about the sum of perimeters
        System.out.printf("Sum of perimeters = %.4f\n", sumOfPerimeters);
    }
}
