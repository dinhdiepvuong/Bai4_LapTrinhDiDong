package edu.iuh.bai5_chiecbanh;

public class Donut {
    private int imageThing;
    private String name;
    private String nameMoTa;
    private int newPrice;

    public Donut(int imageThing, String name, String nameMoTa, int newPrice) {
        this.imageThing = imageThing;
        this.name = name;
        this.nameMoTa = nameMoTa;
        this.newPrice = newPrice;
    }

    public void setImageThing(int imageThing) {
        this.imageThing = imageThing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameMoTa(String nameMoTa) {
        this.nameMoTa = nameMoTa;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public int getImageThing() {
        return imageThing;
    }

    public String getName() {
        return name;
    }

    public String getNameMoTa() {
        return nameMoTa;
    }

    public int getNewPrice() {
        return newPrice;
    }
}
