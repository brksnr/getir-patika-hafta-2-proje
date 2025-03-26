package service;

import repository.VillaRepository;
import house.Villa;
import java.util.List;
import java.util.stream.Collectors;

public class VillaService {
    private final VillaRepository villaRepository;

    public VillaService(VillaRepository villaRepository) {
        this.villaRepository = villaRepository;
    }

    public double getTotalPrice() {
        List<Villa> villas = villaRepository.getVillaList();
        return villas.stream()
                .mapToDouble(Villa::getPrice)
                .sum();
    }

    public double getAverageSquareMeters() {
        List<Villa> villas = villaRepository.getVillaList();
        return villas.stream()
                .mapToDouble(Villa::getSquareMeters)
                .average()
                .orElse(0);
    }

    public List<Villa> filterVillasByRoomsAndLivingRooms(int rooms, int livingRooms) {
        List<Villa> villas = villaRepository.getVillaList();
        return villas.stream()
                .filter(villa -> villa.getNumberOfRooms() == rooms && villa.getNumberOfLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }
}
