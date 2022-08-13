package lesson_08_Java.Figures;

/**
 * The class displays information about the name of the figure,
 * and also calculates and displays information about the perimeter of the triangle and its area
 */
class Triangle extends SomeFigure {
    private int triangleFirstSide; // Triangle first side
    private int triangleSecondSide; // Triangle second side
    private int triangleBase; // Triangle base
    private int triangleHeight; // Triangle height

    // Constructor
    Triangle() {
    }

    // Overridden show shape name method
    @Override
    String figureName() {
        return "Triangle";
    }

    // Overridden perimeter calculation method
    @Override
    float perimeter() {
        return getTriangleFirstSide() + getTriangleSecondSide() + getTriangleBase();
    }

    // Overridden area calculation method
    @Override
    float area() {
        return (float) (0.5 * getTriangleBase() * getTriangleHeight());
    }

    // Getters and Setters
    int getTriangleFirstSide() {
        return triangleFirstSide;
    }

    void setTriangleFirstSide(int triangleFirstSide) {
        this.triangleFirstSide = triangleFirstSide;
    }

    int getTriangleSecondSide() {
        return triangleSecondSide;
    }

    void setTriangleSecondSide(int triangleSecondSide) {
        this.triangleSecondSide = triangleSecondSide;
    }

    int getTriangleBase() {
        return triangleBase;
    }

    void setTriangleBase(int triangleBase) {
        this.triangleBase = triangleBase;
    }

    int getTriangleHeight() {
        return triangleHeight;
    }

    void setTriangleHeight(int triangleHeight) {
        this.triangleHeight = triangleHeight;
    }
}
