package service;

import model.House;
import repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private final HouseRepository houseRepository = new HouseRepository();

    public void add(House house) {
        houseRepository.add(house);
    }

    public void remove(House house) {
        houseRepository.remove(house);
    }

    public List<House> findAll() {
        return houseRepository.findAll();
    }

    public House findById(int id) {
        return houseRepository.findById(id);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        List<House> houses = houseRepository.findAll();

        for (House house : houses) {
            totalPrice += house.getPrice();
        }

        return totalPrice;
    }

    public double getAverageArea() {
        double totalArea = 0;
        double averageArea = 0;
        List<House> houses = houseRepository.findAll();

        for (House house : houses) {
            totalArea += house.getArea();
        }

        averageArea = totalArea / houses.size();

        return averageArea;
    }

    public List<House> filterByRoomAndHall(short room, short hall) {
        List<House> houses = houseRepository.findAll();
        List<House> filteredHouses = new ArrayList<House>();

        for (House house : houses) {
            if (house.getRoom() == room && house.getHall() == hall) {
                filteredHouses.add(house);
            }
        }

        return filteredHouses;
    }
}
