package entity;

import core.ComboItem;

import java.lang.reflect.Type;

public class Model {
    private int id;
    private int brand_id;
    private String name;
    private Type type;
    private String year;
    private Fuel fuel;
    private Gear gear;
    private Brand brand;

    public enum Fuel{
        GASOLINE, DIESEL, LPG, ELECTRIC
    }

    public enum Gear{
        AUTO, MANUEL
    }

    public enum Type{
        SEDAN, HATCHBACK
    }

    public Model() {
    }

    public Model(int id, int brand_id, String name, Type type, String year, Fuel fuel, Gear gear) {
        this.id = id;
        this.brand_id = brand_id;
        this.name = name;
        this.type = type;
        this.year = year;
        this.fuel = fuel;
        this.gear = gear;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getBrand_id() {return brand_id;}

    public void setBrand_id(int brand_id) {this.brand_id = brand_id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Type getType() {return type;}

    public void setType(Type type) {this.type = type;}

    public String getYear() {return year;}

    public void setYear(String year) {this.year = year;}

    public Fuel getFuel() {return fuel;}

    public void setFuel(Fuel fuel) {this.fuel = fuel;}

    public Gear getGear() {return gear;}

    public void setGear(Gear gear) {this.gear = gear;}

    public Brand getBrand() {return brand;}

    public void setBrand(Brand brand) {this.brand = brand;}

    public ComboItem getComboItem(){
        return new ComboItem(this.getId(), this.getBrand().getName() + " - " + this.getName()+ " - " + this.getYear() +  " - " + this.getGear());
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", brand_id=" + brand_id +
                ", name=" + name +
                ", type=" + type +
                ", year=" + year +
                ", fuel=" + fuel +
                ", gear=" + gear +
                ", brand=" + brand +
                '}';
    }
}

