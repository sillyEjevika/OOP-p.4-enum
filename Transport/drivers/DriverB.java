package Transport.drivers;

public class DriverB extends Driver{
    public DriverB(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void startDrive() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");

    }

    @Override
    public void stopDrive() {
        System.out.println("Водитель категории В " + getFullName() + " остановился");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории В " + getFullName() + " заправился");
    }
}
