public class Car {
    public String brand;
    public String modeL;
    public double engineaVolume;
    public String color;
    public int productionYear;
    public String origin;

    public Car(String brand, String modeL, double engineaVolume, String color, int productionYear, String origin) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (modeL == null) {
            this.modeL = "default";
        } else {
            this.modeL = modeL;
        }
        if (Double.compare(engineaVolume, 0) == 0) {
            this.engineaVolume = 1.5;
        } else {
            this.engineaVolume = engineaVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (origin == null) {
            this.origin = "default";
        } else {

            this.origin = origin;

        }
    }
}