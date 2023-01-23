import Transport.Bus;
import Transport.Cars;
import Transport.Trucks;

public class Main {
    public static void main(String[] args) {
        Cars lada = new Cars("Lada", "Granta", 1.7);
        Cars bmw = new Cars("BMW", "X6", 4.2);
        Cars skoda = new Cars("Skoda", "Octavia", 1.6);
        Cars hundai = new Cars("Hundai", "Solaris", 1.6);
        Trucks kamaz = new Trucks("KAMAZ", "6511", 11.76);
        Trucks kamaz2 = new Trucks("KAMAZ", "65115", 25.11);
        Trucks man = new Trucks("MAN", "TGS", 10.5);
        Trucks man2 = new Trucks("MAN", "TGX", 12.4);
        Bus hundaiBus = new Bus("Hundai", "Aero Express", 12.9);
        Bus maz = new Bus("MAZ", "203", 11.3);
        Bus volvo = new Bus("Volvo", "7900", 12.4);
        Bus kia = new Bus("Kia", "Granbird", 12.4);

        System.out.println("Задача №1");
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

    }
}