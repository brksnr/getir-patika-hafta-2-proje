package repository;

import house.SummerHouse;
import java.util.ArrayList;
import java.util.List;

public class SummerHouseRepository {
    private List<SummerHouse> summerHouseList;

    public SummerHouseRepository() {
        summerHouseList = new ArrayList<>();

        summerHouseList.add(new SummerHouse("SummerHouse1",2000000, 200, 3, 2));
        summerHouseList.add(new SummerHouse("SummerHouse2",3000000, 250, 4, 2));
        summerHouseList.add(new SummerHouse("SummerHouse3",4000000, 300, 5, 2));
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }
}
