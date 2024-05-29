package model;

import model.enums.ImmovableType;

public abstract class Immovable {
    private Long id;
    private String address;
    private double area;
    private double price;
    private short room;
    private short hall;
    private ImmovableType immovableType;

    public Immovable(Long id, String address, double area, double price, short room, short hall, ImmovableType immovableType) {
        this.id = id;
        this.address = address;
        this.area = area;
        this.price = price;
        this.room = room;
        this.hall = hall;
        this.immovableType = immovableType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public short getRoom() {
        return room;
    }

    public void setRoom(short room) {
        this.room = room;
    }

    public short getHall() {
        return hall;
    }

    public void setHall(short hall) {
        this.hall = hall;
    }

    public ImmovableType getImmovableType() {
        return immovableType;
    }

    public void setImmovableType(ImmovableType immovableType) {
        this.immovableType = immovableType;
    }
}
