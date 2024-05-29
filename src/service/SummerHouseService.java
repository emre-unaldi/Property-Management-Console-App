package service;

import model.House;
import model.SummerHouse;
import repository.SummerHouseRepository;

import java.util.ArrayList;
import java.util.List;

public class SummerHouseService {
    private final SummerHouseRepository summerHouseRepository = new SummerHouseRepository();

    public void add(SummerHouse summerHouse) {
        summerHouseRepository.add(summerHouse);
    }

    public void remove(SummerHouse summerHouse) {
        summerHouseRepository.remove(summerHouse);
    }

    public List<SummerHouse> findAll() {
        return summerHouseRepository.findAll();
    }

    public SummerHouse findById(int id) {
        return summerHouseRepository.findById(id);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        List<SummerHouse> summerHouses = summerHouseRepository.findAll();

        for (SummerHouse summerHouse : summerHouses) {
            totalPrice += summerHouse.getPrice();
        }

        return totalPrice;
    }

    public double getAverageArea() {
        double totalArea = 0;
        double averageArea = 0;
        List<SummerHouse> summerHouses = summerHouseRepository.findAll();

        for (SummerHouse summerHouse : summerHouses) {
            totalArea += summerHouse.getArea();
        }

        averageArea = totalArea / summerHouses.size();

        return averageArea;
    }

    public List<SummerHouse> filterByRoomAndHall(short room, short hall) {
        List<SummerHouse> summerHouses = summerHouseRepository.findAll();
        List<SummerHouse> filteredSummerHouses = new ArrayList<SummerHouse>();

        for (SummerHouse summerHouse : summerHouses) {
            if (summerHouse.getRoom() == room && summerHouse.getHall() == hall) {
                filteredSummerHouses.add(summerHouse);
            }
        }

        return filteredSummerHouses;
    }
}
