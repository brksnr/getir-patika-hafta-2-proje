package repository;

import house.Apartment;
import java.util.ArrayList;
import java.util.List;

public class ApartmentRepository {
    private List<Apartment> apartmentList;

    public ApartmentRepository() {
        apartmentList = new ArrayList<>();

        apartmentList.add(new Apartment("apartment1",1000000, 120, 3, 1));
        apartmentList.add(new Apartment("apartment2",2000000, 130, 4, 1));
        apartmentList.add(new Apartment("apartment3",3000000, 140, 5, 1));
    }

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }
}

