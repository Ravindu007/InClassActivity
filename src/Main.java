import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        final double KILOGRAMS_PER_POUND = 0.454;
        final double METERS_PER_FOOT = 0.3046;

        System.out.println("BMI calculator");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter wieght(lbs): ");
        double weight = Double.parseDouble(input.readLine());

        System.out.println("Enter height(feet): ");
        double height = Double.parseDouble(input.readLine());

        double metricWeight = weight * KILOGRAMS_PER_POUND;
        double metricHeight = height * METERS_PER_FOOT;

        double BMI = metricWeight / (metricHeight * metricHeight);

        System.out.println("A person with weight " + weight+ "(lbs) and height of " + height + "(meters) has a " +
                "BMI of " + BMI);
    }
}
