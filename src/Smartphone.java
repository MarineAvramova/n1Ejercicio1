public class Smartphone extends Phone implements Camera, Clock{

    @Override
    public void alarm() {
        System.out.println("The alarm is sounding");
    }
}
