package Transport;

import Transport.drivers.Driver;
import Transport.exaption.DiagnosticFailedExaption;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Transport<T extends Driver> implements Competing {
    private  String brand;
    private String model;
    private double engineVolume;
    private T driver;
    //private final List<Mechanics> mechanics = new ArrayList<>();
    private final Set<Mechanics> mechanics = new HashSet<>();

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        this.driver = driver;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void printType();

    public abstract boolean takeDiagnostics() throws DiagnosticFailedExaption;

    public Set<Mechanics> getMechanics() {
        return mechanics;
    }

    public void addMechanics(Mechanics mechanic) {
        mechanics.add(mechanic);
    }

    @Override
    public String toString() {
        return "Транспорт" +
                " марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume;

    }
}
