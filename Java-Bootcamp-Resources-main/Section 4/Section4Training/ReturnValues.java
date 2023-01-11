package Section4Training;

public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.3, 3.5);
    }
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
 