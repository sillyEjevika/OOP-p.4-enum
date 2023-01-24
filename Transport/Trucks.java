package Transport;

import Transport.drivers.DriverC;

public class Trucks extends Transport<DriverC> {
    private TruckCarring truckCarring;

    public enum TruckCarring {
        N1(0.0f, 3.5f),
        N2(3.501f, 12f),
        N3(12f, null);
        private Float lowTruckCarring;
        private Float upTruckCarring;

        TruckCarring(Float lowTruckCarring, Float upTruckCarring) {
            this.lowTruckCarring = lowTruckCarring;
            this.upTruckCarring = upTruckCarring;
        }

        public Float getLowTruckCarring() {
            return lowTruckCarring;
        }

        public Float getUpTruckCarring() {
            return upTruckCarring;
        }

        @Override
        public String toString() {
            if (upTruckCarring != null) {
                return "Грузоподъемность от " + lowTruckCarring + " тонн до " + upTruckCarring;
            } else
                return "Грузоподъемность свыше " + lowTruckCarring;
        }
    }

    public Trucks(String brand, String model, double engineVolume, DriverC driver, TruckCarring truckCarring) {
        super(brand, model, engineVolume, driver);
        this.truckCarring = truckCarring;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп: " + getBrand());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + "7 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: " + getBrand() + "130 км/ч.");
    }

    public TruckCarring getTruckCarring() {
        return truckCarring;
    }

    public void setTruckCarring(TruckCarring truckCarring) {
        this.truckCarring = truckCarring;
    }
    @Override
    public void printType() {
        if (truckCarring != null) {
            System.out.println(truckCarring);
        }else{
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}

