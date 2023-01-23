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

    @Override
    public void pitStop() {
        System.out.println("Пит стоп: " + getBrand());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: "+ getBrand() + "7 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: " + getBrand() + "130 км/ч.");

    }
}
