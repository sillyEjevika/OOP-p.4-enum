package Transport;

import Transport.drivers.DriverD;

public class Bus extends Transport<DriverD> {
    private BusCapacity busCapacity;
    public enum BusCapacity {
        VERY_SMAL (0, 10),
        SMALL(11, 25),
        MIDDLE(40, 50),
        LARGE(60, 80),
        VERY_LARGE(100, 120);

        private final Integer lowCapacity;
        private final Integer upCapacity;

        BusCapacity(Integer lowCapacity, Integer upCapacity) {
            this.lowCapacity = lowCapacity;
            this.upCapacity = upCapacity;
        }

        public Integer getLowCapacity() {
            return lowCapacity;
        }

        public Integer getUpCapacity() {
            return upCapacity;
        }

        @Override
        public String toString() {
            return "Вместимость от " + lowCapacity + " мест до " + upCapacity;
        }
    }
    public Bus(String brand, String model, double engineVolume, DriverD driverD,BusCapacity busCapacity) {
        super(brand, model, engineVolume, driverD);
        this.busCapacity = busCapacity;
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

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    public void printType() {
        if (busCapacity != null) {
            System.out.println(busCapacity);
        }else{
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}
