package service;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private final ApartmentService apartmentService;
    private final SummerHouseService summerHouseService;
    private final VillaService villaService;

    public HouseService(ApartmentService apartmentService, SummerHouseService summerHouseService, VillaService villaService) {
        this.apartmentService = apartmentService;
        this.summerHouseService = summerHouseService;
        this.villaService = villaService;
    }

    public double getTotalPrice() {
        double apartmentTotal = apartmentService.getTotalPrice();
        double summerHouseTotal = summerHouseService.getTotalPrice();
        double villaTotal = villaService.getTotalPrice();
        return apartmentTotal + summerHouseTotal + villaTotal;
    }

    public double getAverageSquareMeters() {
        List<Double> averages = new ArrayList<>();

        averages.add(apartmentService.getAverageSquareMeters());
        averages.add(summerHouseService.getAverageSquareMeters());
        averages.add(villaService.getAverageSquareMeters());

        double totalSquareMeters = averages.stream().mapToDouble(Double::doubleValue).sum();

        int totalCount = averages.size();

        return totalSquareMeters / totalCount;
    }


    public List<Object> filterAllHousesByRoomsAndLivingRooms(int rooms, int livingRooms) {
        List<Object> allHouses = new ArrayList<>();
        allHouses.addAll(apartmentService.filterApartmentsByRoomsAndLivingRooms(rooms, livingRooms));
        allHouses.addAll(summerHouseService.filterSummerHousesByRoomsAndLivingRooms(rooms, livingRooms));
        allHouses.addAll(villaService.filterVillasByRoomsAndLivingRooms(rooms, livingRooms));
        return allHouses;
    }

}
