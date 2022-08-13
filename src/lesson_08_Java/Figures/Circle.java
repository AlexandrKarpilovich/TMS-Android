package lesson_08_Java.Figures;

/**
 * The class displays information about the name of the figure,
 * and also calculates and displays information about the perimeter of the circle and its area
 */
class Circle extends SomeFigure {
    private int diameter; // Circle diameter
    private final float PI = (float) 3.1415; // PI constant

    // Constructor
    Circle() {
    }

    // Overridden show shape name method
    @Override
    String figureName() {
        return "Circle";
    }

    // Overridden perimeter calculation method
    @Override
    float perimeter() {
        return getPI() * getDiameter();
    }

    // Overridden area calculation method
    @Override
    float area() {
        return (getPI() * getDiameter() * getDiameter()) / 4;
    }

    // Getters and Setters
    int getDiameter() {
        return diameter;
    }

    void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    float getPI() {
        return PI;
    }
}
