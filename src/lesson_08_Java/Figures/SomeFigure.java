package lesson_08_Java.Figures;

/**
 * The abstract class displays information about the name of the figure,
 * and also calculates and displays information about the perimeter of some figure and its area
 */
abstract class SomeFigure {

    // Constructor
    protected SomeFigure() {
    }

    // Abstract method for showing the figure name
    abstract String figureName();

    // Abstract method for calculating the perimeter
    abstract float perimeter();

    // Abstract method for calculating the area
    abstract float area();
}
