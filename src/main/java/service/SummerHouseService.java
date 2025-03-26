package service;

import repository.SummerHouseRepository;
import house.SummerHouse;
import java.util.List;
import java.util.stream.Collectors;

public class SummerHouseService {
    private final SummerHouseRepository summerHouseRepository;

    public SummerHouseService(SummerHouseRepository summerHouseRepository) {
        this.summerHouseRepository = summerHouseRepository;
    }

    public double getTotalPrice() {
        List<SummerHouse> summerHouses = summerHouseRepository.getSummerHouseList();
        return summerHouses.stream()
                .mapToDouble(SummerHouse::getPrice)
                .sum();
    }

    public double getAverageSquareMeters() {
        List<SummerHouse> summerHouses = summerHouseRepository.getSummerHouseList();
        return summerHouses.stream()
                .mapToDouble(SummerHouse::getSquareMeters)
                .average()
                .orElse(0);
    }

    public List<SummerHouse> filterSummerHousesByRoomsAndLivingRooms(int rooms, int livingRooms) {
        List<SummerHouse> summerHouses = summerHouseRepository.getSummerHouseList();
        return summerHouses.stream()
                .filter(summerHouse -> summerHouse.getNumberOfRooms() == rooms && summerHouse.getNumberOfLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }
}
