package Transport.drivers;

public class DriverC extends Driver{
    public DriverC(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void startDrive() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение");

    }

    @Override
    public void stopDrive() {
        System.out.println("Водитель категории C " + getFullName() + " остановился");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории C " + getFullName() + " заправился");
    }
}