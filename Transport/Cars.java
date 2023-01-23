package Transport;

public class Cars extends Transport{
    public Cars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль "+getBrand()+" начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль "+getBrand()+" закончил движение");

    }
}
