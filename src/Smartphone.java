public class Smartphone extends Phone implements Camera, Clock{
public Smartphone(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void alarm() {
        super.call(676899800);
        System.out.println("The alarm is sounding");
    }
}
