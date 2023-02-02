package Transport;

import java.util.Objects;

public class Mechanics {
    public enum MechanicsType {
        CARS,
        BUS,
        TRUCK,
        ALL
    }

    private String nameSurname;
    private String company;
    private MechanicsType mechanicsType;

    public Mechanics(String nameSurname, String company, MechanicsType mechanicsType) {
        this.nameSurname = nameSurname;
        this.company = company;
        this.mechanicsType = mechanicsType;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void maintenance() {
        System.out.println("Обслуживание автомобиля производит " + nameSurname + "из компании " + company);
    }

    public void fixTransport() {
        System.out.println("Машину чинит " +  nameSurname +" из компании " + company);
    }

    public MechanicsType getMechanicsType() {
        return mechanicsType;
    }

    public void setMechanicsType(MechanicsType mechanicsType) {
        this.mechanicsType = mechanicsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanics)) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(nameSurname, mechanics.nameSurname) && Objects.equals(company, mechanics.company) && mechanicsType == mechanics.mechanicsType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSurname, company, mechanicsType);
    }

    @Override
    public String toString() {
        return "Механик - " + nameSurname +
                " из компании " + company +
                "может обслуживать " + mechanicsType;
    }
}


