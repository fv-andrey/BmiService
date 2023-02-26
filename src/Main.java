public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double meter = 1.72;
        double kilogram = 75.5;

        int massIndex = service.calculate(meter,kilogram);

        System.out.println(massIndex);
    }
}
