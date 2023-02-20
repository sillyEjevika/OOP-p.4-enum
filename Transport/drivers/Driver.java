package Transport.drivers;

import Transport.Transport;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean license;
    private int experience;

    public Driver(String fullName, boolean license, int experience) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
    }

    public abstract void startDrive();

    public abstract void stopDrive();

    public abstract void refuelCar();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель: " + fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return license == driver.license && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, license, experience);
    }
}

