package lesson_08_Java.Figures;

/**
 * The class displays information about the name of the figure,
 * and also calculates and displays information about the perimeter of the rectangle and its area
 */
class Rectangle extends SomeFigure {
    private int rectangleLength; // Rectangle length
    private int rectangleWidth; // Rectangle width

    // Constructor
    Rectangle() {
    }

    // Overridden show shape name method
    @Override
    String figureName() {
        return "Rectangle";
    }

    // Overridden perimeter calculation method
    @Override
    float perimeter() {
        return 2 * (getRectangleLength() + getRectangleWidth());
    }

    // Overridden are calculation method
    @Override
    float area() {
        return getRectangleLength() * getRectangleWidth();
    }

    // Getters and Setters
    int getRectangleLength() {
        return rectangleLength;
    }

    void setRectangleLength(int rectangleLength) {
        this.rectangleLength = rectangleLength;
    }

    int getRectangleWidth() {
        return rectangleWidth;
    }

    void setRectangleWidth(int rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }
}
