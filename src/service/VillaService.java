package service;

import model.Villa;
import repository.VillaRepository;

import java.util.ArrayList;
import java.util.List;

public class VillaService {
    private final VillaRepository villaRepository = new VillaRepository();

    public void add(Villa villa) {
        villaRepository.add(villa);
    }

    public void remove(Villa villa) {
        villaRepository.remove(villa);
    }

    public List<Villa> findAll() {
        return villaRepository.findAll();
    }

    public Villa findById(int id) {
        return villaRepository.findById(id);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        List<Villa> villas = villaRepository.findAll();

        for (Villa villa : villas) {
            totalPrice += villa.getPrice();
        }

        return totalPrice;
    }

    public double getAverageArea() {
        double totalArea = 0;
        double averageArea = 0;
        List<Villa> villas = villaRepository.findAll();

        for (Villa villa : villas) {
            totalArea += villa.getArea();
        }

        averageArea = totalArea / villas.size();

        return averageArea;
    }

    public List<Villa> filterByRoomAndHall(short room, short hall) {
        List<Villa> villas = villaRepository.findAll();
        List<Villa> filteredVillas = new ArrayList<Villa>();

        for (Villa villa : villas) {
            if (villa.getRoom() == room && villa.getHall() == hall) {
                filteredVillas.add(villa);
            }
        }

        return filteredVillas;
    }
}
