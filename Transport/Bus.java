package Transport;

public class Bus extends Transport{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус "+getBrand()+" начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус "+getBrand()+" закончил движение");
    }
}
