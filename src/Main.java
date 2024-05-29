import model.House;
import model.Immovable;
import model.SummerHouse;
import model.Villa;
import service.HouseService;
import service.SummerHouseService;
import service.VillaService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void houseOperations(HouseService houseService) {
        houseService.add(new House(1L, "123 Main St", 120.5, 250000, (short) 3, (short) 2, true));
        houseService.add(new House(2L, "456 Elm St", 85.0, 180000, (short) 2, (short) 1, false));
        houseService.add(new House(3L, "789 Oak St", 150.0, 300000, (short) 4, (short) 3, true));
        houseService.add(new House(4L, "101 Pine St", 95.5, 200000, (short) 2, (short) 1, false));
        houseService.add(new House(5L, "202 Birch St", 110.0, 220000, (short) 3, (short) 2, true));

        System.out.println("Total price of houses: " + houseService.getTotalPrice());
        System.out.println("Average square meters of houses: " + houseService.getAverageArea());
    }

    public static void summerHouseOperations(SummerHouseService summerHouseService) {
        summerHouseService.add(new SummerHouse(6L, "303 Palm St", 95.0, 180000, (short) 2, (short) 1, true));
        summerHouseService.add(new SummerHouse(7L, "505 Maple St", 200.0, 350000, (short) 5, (short) 3, false));
        summerHouseService.add(new SummerHouse(8L, "707 Cedar St", 150.5, 280000, (short) 4, (short) 2, true));
        summerHouseService.add(new SummerHouse(9L, "909 Pine St", 80.0, 150000, (short) 2, (short) 1, false));
        summerHouseService.add(new SummerHouse(10L, "1111 Oak St", 120.0, 220000, (short) 3, (short) 2, true));

        System.out.println("Total price of summerhouses: " + summerHouseService.getTotalPrice());
        System.out.println("Average square meters of summerhouses: " + summerHouseService.getAverageArea());
    }

    public static void villaOperations(VillaService villaService) {
        villaService.add(new Villa(11L, "1313 Elm St", 175.0, 320000, (short) 4, (short) 2, false));
        villaService.add(new Villa(12L, "1515 Maple St", 90.0, 180000, (short) 3, (short) 1, true));
        villaService.add(new Villa(13L, "1717 Pine St", 200.0, 380000, (short) 5, (short) 3, false));
        villaService.add(new Villa(14L, "1919 Oak St", 120.0, 220000, (short) 3, (short) 2, true));
        villaService.add(new Villa(15L, "2121 Cedar St", 150.0, 280000, (short) 4, (short) 2, false));

        System.out.println("Total price of villas: " + villaService.getTotalPrice());
        System.out.println("Average square meters of villas: " + villaService.getAverageArea());
    }

    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        SummerHouseService summerHouseService = new SummerHouseService();
        VillaService villaService = new VillaService();

        System.out.println("***********************************************************************************************************");
        houseOperations(houseService);
        System.out.println("***********************************************************************************************************");
        summerHouseOperations(summerHouseService);
        System.out.println("***********************************************************************************************************");
        villaOperations(villaService);
        System.out.println("***********************************************************************************************************");

        System.out.println("***********************************************************************************************************");
        Double totalImmovablePrice = summerHouseService.getTotalPrice() + villaService.getTotalPrice() + houseService.getTotalPrice();
        System.out.println("Total price of immovables: " + totalImmovablePrice);
        System.out.println("***********************************************************************************************************");

        System.out.println("***********************************************************************************************************");
        Double averageImmovableArea = summerHouseService.getAverageArea() + villaService.getAverageArea() + houseService.getAverageArea();
        System.out.println("Average square meters of immovables: " + averageImmovableArea);
        System.out.println("***********************************************************************************************************");

        System.out.println("***********************************************************************************************************");
        System.out.println("Filtering all types of houses according to the number of rooms and living rooms: \n");
        List<Immovable> filteredList = new ArrayList<>();
        List<House> filteredHouses = houseService.filterByRoomAndHall((short) 3, (short) 2);
        List<SummerHouse> filteredSummerHouses = summerHouseService.filterByRoomAndHall((short) 3, (short) 2);
        List<Villa> filteredVillas = villaService.filterByRoomAndHall((short) 3, (short) 2);

        filteredList.addAll(filteredHouses);
        filteredList.addAll(filteredSummerHouses);
        filteredList.addAll(filteredVillas);

        filteredList.stream().forEach(System.out::println);
        System.out.println("***********************************************************************************************************");
    }
}