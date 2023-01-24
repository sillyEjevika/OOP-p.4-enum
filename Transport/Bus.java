package Transport;

import Transport.drivers.DriverC;
import Transport.drivers.DriverD;

public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driverD) {
        super(brand, model, engineVolume, driverD);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус "+getBrand()+" начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус "+getBrand()+" закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп: " + getBrand());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: "+ getBrand() + "13 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: " + getBrand() + "110 км/ч.");
    }
}
