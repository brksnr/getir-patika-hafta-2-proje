package repository;

import house.Villa;
import java.util.ArrayList;
import java.util.List;

public class VillaRepository {
    private List<Villa> villaList;

    public VillaRepository() {
        villaList = new ArrayList<>();

        villaList.add(new Villa("Villa1",5000000, 300, 3, 2));
        villaList.add(new Villa("Villa2",6000000, 350, 4, 2));
        villaList.add(new Villa("Villa3",7000000, 400, 5, 2));
    }

    public List<Villa> getVillaList() {
        return villaList;
    }
}
