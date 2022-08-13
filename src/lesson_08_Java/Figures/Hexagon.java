package lesson_08_Java.Figures;

/**
 * The class displays information about the name of the figure,
 * and also calculates and displays information about the perimeter of the hexagon and its area
 */
class Hexagon extends SomeFigure {
    private int hexagonSide; // Hexagon side

    // Constructor
    Hexagon() {
    }

    // Overridden show shape name method
    @Override
    String figureName() {
        return "Hexagon";
    }

    // Overridden perimeter calculation method
    @Override
    float perimeter() {
        return getHexagonSide() * 6;
    }

    // Overridden area calculation method
    @Override
    float area() {
        return (float) ((3 * getHexagonSide() * getHexagonSide() * Math.sqrt(3)) / 2);
    }

    // Getters and Setters
    int getHexagonSide() {
        return hexagonSide;
    }

    void setHexagonSide(int hexagonSide) {
        this.hexagonSide = hexagonSide;
    }
}
