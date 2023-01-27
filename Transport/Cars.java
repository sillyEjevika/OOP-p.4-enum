package Transport;
import Transport.drivers.DriverB;
import Transport.exaption.DiagnosticFailedExaption;

import java.util.ArrayList;

public class Cars extends Transport <DriverB> {
    private CarsTypeOfBody rusNameOfBody;

    public enum CarsTypeOfBody {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String rusNameOfBody;

        CarsTypeOfBody(String rusNameOfBody) {
            this.rusNameOfBody = rusNameOfBody;
        }

        public String getRusNameOfBody() {
            return rusNameOfBody;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + rusNameOfBody;
        }
    }

    public Cars(String brand, String model, double engineVolume, DriverB driver, CarsTypeOfBody rusNameOfBody) {
        super(brand, model, engineVolume, driver);
        this.rusNameOfBody = rusNameOfBody;
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп: " + getBrand());
    }


    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + " = 2 мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: " + getBrand() + " = 210 км/ч.");
    }

    public CarsTypeOfBody getRusNameOfBody() {
        return rusNameOfBody;
    }

    public void setRusNameOfBody(CarsTypeOfBody rusNameOfBody) {
        this.rusNameOfBody = rusNameOfBody;
    }


    public void printType() {
        if (rusNameOfBody != null) {
            System.out.println(rusNameOfBody);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public boolean takeDiagnostics() throws DiagnosticFailedExaption {
        if (getDriver() != null && getDriver().isLicense()) {
            return true;
        } else {
            throw new DiagnosticFailedExaption();
        }
    }
}
