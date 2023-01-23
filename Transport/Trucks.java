package Transport;

public class Trucks extends Transport{
    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль "+getBrand()+" начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовой автомобиль "+getBrand()+" закончил движение");
    }
}
