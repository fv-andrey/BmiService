public class BmiService {

    public int calculate (double meter, double kilogram){

        double index = kilogram / (meter*meter);

        return (int) index;
    }
}
