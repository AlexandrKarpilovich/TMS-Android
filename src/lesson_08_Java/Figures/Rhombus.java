package lesson_08_Java.Figures;

/**
 * The class displays information about the name of the figure,
 * and also calculates and displays information about the perimeter of the rhombus and its area
 */
class Rhombus extends SomeFigure {
    private int rhombusSide; // Rhombus side
    private int rhombusHeight; // Rhombus height

    // Constructor
    Rhombus() {
    }

    // Overridden show shape name method
    @Override
    String figureName() {
        return "Rhombus";
    }

    // Overridden perimeter calculation method
    @Override
    float perimeter() {
        return 4 * getRhombusSide();
    }

    // Overridden area calculation method
    @Override
    float area() {
        return getRhombusSide() * getRhombusHeight();
    }

    // Getters and Setters
    int getRhombusSide() {
        return rhombusSide;
    }

    void setRhombusSide(int rhombusSide) {
        this.rhombusSide = rhombusSide;
    }

    int getRhombusHeight() {
        return rhombusHeight;
    }

    void setRhombusHeight(int rhombusHeight) {
        this.rhombusHeight = rhombusHeight;
    }
}
