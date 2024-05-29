package model;

import model.enums.ImmovableType;

public class Villa extends Immovable{
    private boolean isPool;

    public Villa(Long id, String address, double area, double price, short room, short hall, boolean isPool) {
        super(id, address, area, price, room, hall, ImmovableType.VILLA);
        this.isPool = isPool;
    }

    public boolean isPool() {
        return isPool;
    }

    public void setPool(boolean pool) {
        isPool = pool;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id=" + this.getId() +
                ", address='" + this.getAddress() + '\'' +
                ", area=" + this.getArea() +
                ", price=" + this.getPrice() +
                ", room=" + this.getRoom() +
                ", hall=" + this.getHall() +
                ", isGarden=" + this.isPool() +
                ", immovableType=" + this.getImmovableType() +
                '}';
    }
}
