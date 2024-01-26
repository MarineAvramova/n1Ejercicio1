public class Phone {
   private String brand;
   private String model;

    public Phone(String brand, String model){
       this.brand = brand;
       this.model = model;
   }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
    void call(int numberOfPhone){
        System.out.println(numberOfPhone + "is calling");
    }
}
