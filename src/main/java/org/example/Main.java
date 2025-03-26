package org.example;

import repository.ApartmentRepository;
import repository.SummerHouseRepository;
import repository.VillaRepository;
import service.ApartmentService;
import service.SummerHouseService;
import service.VillaService;
import service.HouseService;

public class Main {
    public static void main(String[] args) {

        VillaRepository villaRepository = new VillaRepository();
        ApartmentRepository apartmentRepository = new ApartmentRepository();
        SummerHouseRepository summerHouseRepository = new SummerHouseRepository();

        VillaService villaService = new VillaService(villaRepository);
        ApartmentService apartmentService = new ApartmentService(apartmentRepository);
        SummerHouseService summerHouseService = new SummerHouseService(summerHouseRepository);

        HouseService houseService = new HouseService(apartmentService, summerHouseService, villaService);

        double totalVillaPrice = villaService.getTotalPrice();
        System.out.println("Villaların toplam fiyatı: " + totalVillaPrice);

        double totalSummerHousePrice = summerHouseService.getTotalPrice();
        System.out.println("Yazlıkların toplam fiyatı: " + totalSummerHousePrice);

        double totalHousePrice = houseService.getTotalPrice();
        System.out.println("Tüm evlerin toplam fiyatı: " + totalHousePrice);

        double averageVillaSquareMeters = villaService.getAverageSquareMeters();
        System.out.println("Villaların ortalama metrekaresi: " + averageVillaSquareMeters);

        double averageSummerHouseSquareMeters = summerHouseService.getAverageSquareMeters();
        System.out.println("Yazlıkların ortalama metrekaresi: " + averageSummerHouseSquareMeters);

        double averageHouseSquareMeters = houseService.getAverageSquareMeters();
        System.out.println("Tüm evlerin ortalama metrekaresi: " + averageHouseSquareMeters);

        int rooms = 3;
        int livingRooms = 2;
        var filteredHouses = houseService.filterAllHousesByRoomsAndLivingRooms(rooms, livingRooms);
        System.out.println("Filtrelenen evler: " + filteredHouses);
    }
}
