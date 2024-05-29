package model;

import model.enums.ImmovableType;

public class SummerHouse extends Immovable {
    private boolean isSeaside;

    public SummerHouse(Long id, String address, double area, double price, short room, short hall, boolean isSeaside) {
        super(id, address, area, price, room, hall, ImmovableType.SUMMER_HOUSE);
        this.isSeaside = isSeaside;
    }

    public boolean isSeaside() {
        return isSeaside;
    }

    public void setSeaside(boolean seaside) {
        isSeaside = seaside;
    }

    @Override
    public String toString() {
        return "SummerHouse{" +
                "id=" + this.getId() +
                ", address='" + this.getAddress() + '\'' +
                ", area=" + this.getArea() +
                ", price=" + this.getPrice() +
                ", room=" + this.getRoom() +
                ", hall=" + this.getHall() +
                ", isGarden=" + this.isSeaside() +
                ", immovableType=" + this.getImmovableType() +
                '}';
    }
}
