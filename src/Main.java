import Transport.Bus;
import Transport.Cars;
import Transport.Trucks;
import Transport.drivers.DriverB;
import Transport.drivers.DriverC;
import Transport.drivers.DriverD;
import Transport.exaption.DiagnosticFailedExaption;

public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Ворчун Андрей Сергеевич", true, 10);
        DriverD driverD = new DriverD("Прилипала Сергей Николаевич", true, 22);
        DriverC driverC = new DriverC("Автобусовозов Николай Петрович", true, 2);
        Cars lada = new Cars("Lada", "Granta", 1.7, driverB, Cars.CarsTypeOfBody.MINIVAN);
        Cars bmw = new Cars("BMW", "X6", 4.2, null, Cars.CarsTypeOfBody.CROSSOVER);
        Cars skoda = new Cars("Skoda", "Octavia", 1.6, driverB, Cars.CarsTypeOfBody.COUPE);
        Cars hundai = new Cars("Hundai", "Solaris", 1.6, driverB, Cars.CarsTypeOfBody.HATCHBACK);
        Trucks kamaz = new Trucks("KAMAZ", "6511", 11.76, driverC, Trucks.TruckCarring.N2);
        Trucks kamaz2 = new Trucks("KAMAZ", "65115", 25.11, driverC, Trucks.TruckCarring.N1);
        Trucks man = new Trucks("MAN", "TGS", 10.5, driverC, Trucks.TruckCarring.N3);
        Trucks man2 = new Trucks("MAN", "TGX", 12.4, driverC, Trucks.TruckCarring.N1);
        Bus hundaiBus = new Bus("Hundai", "Aero Express", 12.9, driverD, Bus.BusCapacity.SMALL);
        Bus maz = new Bus("MAZ", "203", 11.3, driverD, Bus.BusCapacity.MIDDLE);
        Bus volvo = new Bus("Volvo", "7900", 12.4, driverD, Bus.BusCapacity.LARGE);
        Bus kia = new Bus("Kia", "Granbird", 12.4, driverD, Bus.BusCapacity.VERY_LARGE);

       /* System.out.println("Задача №1");
        System.out.println(lada);
        System.out.println(bmw);
        System.out.println(skoda);
        System.out.println(hundai);
        System.out.println(kamaz);
        System.out.println(kamaz2);
        System.out.println(man);
        System.out.println(man2);
        System.out.println(hundaiBus);
        System.out.println(maz);
        System.out.println(volvo);
        System.out.println(kia);
        System.out.println();
        System.out.println("Задача №3");
        lada.pitStop();
        lada.bestLapTime();
        lada.maxSpeed();
        bmw.pitStop();
        bmw.bestLapTime();
        bmw.maxSpeed();
        skoda.pitStop();
        skoda.bestLapTime();
        skoda.maxSpeed();
        hundai.pitStop();
        hundai.bestLapTime();
        hundai.maxSpeed();
        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maxSpeed();
        kamaz2.pitStop();
        kamaz2.bestLapTime();
        kamaz2.maxSpeed();
        man.pitStop();
        man.bestLapTime();
        man.maxSpeed();
        man2.pitStop();
        man2.bestLapTime();
        man2.maxSpeed();
        hundaiBus.pitStop();
        hundaiBus.bestLapTime();
        hundaiBus.maxSpeed();
        maz.pitStop();
        maz.bestLapTime();
        maz.maxSpeed();
        volvo.pitStop();
        volvo.bestLapTime();
        volvo.maxSpeed();
        kia.pitStop();
        kia.bestLapTime();
        kia.maxSpeed();
        System.out.println();
        System.out.println("Задача №4");
        showInfo(lada);
        showInfo(bmw);
        showInfo(skoda);
        showInfo(hundai);
        showInfo(kamaz);
        showInfo(kamaz2);
        showInfo(man);
        showInfo(man2);
        showInfo(hundaiBus);
        showInfo(maz);
        showInfo(volvo);
        showInfo(kia);
        System.out.println();
        System.out.println("Задача №4 emun");
        System.out.println("Легковые автомобили");
        System.out.println(lada);
        lada.printType();
        System.out.println(bmw);
        bmw.printType();
        System.out.println(skoda);
        skoda.printType();
        System.out.println(hundai);
        hundai.printType();
        System.out.println();
        System.out.println("Грузовые атомобили");
        System.out.println(kamaz);
        kamaz.printType();
        System.out.println(kamaz2);
        kamaz2.printType();
        System.out.println(man);
        man.printType();
        System.out.println(man2);
        man2.printType();
        System.out.println();
        System.out.println("Автобусы");
        System.out.println(hundaiBus);
        hundaiBus.printType();
        System.out.println(maz);
        maz.printType();
        System.out.println(volvo);
        volvo.printType();
        System.out.println(kia);
        kia.printType();*/
        System.out.println("Задача №1 исключения");
        try {
            bmw.takeDiagnostics();
        } catch (DiagnosticFailedExaption e) {
            e.printStackTrace();
        }


    }
   /*private static void showInfo(Transport<?> transport) {
        System.out.println("Водитель: "+ transport.getDriver().getFullName() +
                " управляет автомобилем: "+transport.getBrand() + " " + transport.getModel() +
        " и будет участвовать в заезде");
    }*/
}