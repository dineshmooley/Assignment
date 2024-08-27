import java.util.Vector;

public class Assignment2 {
    public static void main(String[] args) {

        Vector<Double> doubleVector = new Vector<>();
        doubleVector.add(10.5);
        doubleVector.add(234.34);
        doubleVector.add(5.534);
        doubleVector.add(3425.875);
        doubleVector.add(384.46);

        System.out.println(doubleVector.contains(10.5));
        System.out.println(doubleVector.size());
        doubleVector.add(3.42);
        System.out.println(doubleVector.size());
    }
}
