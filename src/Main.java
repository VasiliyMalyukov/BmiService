public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(79.4, 1.72); //Масса указывается в килограммах, вес указывается в метрах.
        System.out.println(index);


    }
}