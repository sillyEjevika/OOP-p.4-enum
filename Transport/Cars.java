package Transport;

import Transport.drivers.Driver;
import Transport.drivers.DriverB;

public class Cars extends Transport <DriverB> {
    public Cars(String brand, String model, double engineVolume, DriverB driverB) {
        super(brand, model, engineVolume, driverB);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль "+getBrand()+" начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль "+getBrand()+" закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп: " + getBrand());
    }


    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: "+ getBrand() + " = 2 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: " + getBrand() + " = 210 км/ч.");

    }
}
