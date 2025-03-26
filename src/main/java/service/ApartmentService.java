package service;

import repository.ApartmentRepository;
import house.Apartment;
import java.util.List;
import java.util.stream.Collectors;

public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public double getTotalPrice() {
        List<Apartment> apartments = apartmentRepository.getApartmentList();
        return apartments.stream()
                .mapToDouble(Apartment::getPrice)
                .sum();
    }

    public double getAverageSquareMeters() {
        List<Apartment> apartments = apartmentRepository.getApartmentList();
        return apartments.stream()
                .mapToDouble(Apartment::getSquareMeters)
                .average()
                .orElse(0);
    }

    public List<Apartment> filterApartmentsByRoomsAndLivingRooms(int rooms, int livingRooms) {
        List<Apartment> apartments = apartmentRepository.getApartmentList();
        return apartments.stream()
                .filter(apartment -> apartment.getNumberOfRooms() == rooms && apartment.getNumberOfLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }
}
