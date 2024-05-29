package model;

import model.enums.ImmovableType;

public class House extends Immovable {
    private boolean isGarden;

    public House(Long id, String address, double area, double price, short room, short hall, boolean isGarden) {
        super(id, address, area, price, room, hall, ImmovableType.HOUSE);
        this.isGarden = isGarden;
    }

    public boolean isGarden() {
        return isGarden;
    }

    public void setGarden(boolean garden) {
        isGarden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + this.getId() +
                ", address='" + this.getAddress() + '\'' +
                ", area=" + this.getArea() +
                ", price=" + this.getPrice() +
                ", room=" + this.getRoom() +
                ", hall=" + this.getHall() +
                ", isGarden=" + this.isGarden() +
                ", immovableType=" + this.getImmovableType() +
                '}';
    }
}
