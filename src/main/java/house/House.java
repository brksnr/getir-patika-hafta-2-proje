package house;

public class House {
    private String name;
    private long price;
    private double squareMeters;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public House(String name, long price, double squareMeters, int numberOfRooms, int numberOfLivingRooms) {
        this.name = name;
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", squareMeters=" + squareMeters +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfLivingRooms=" + numberOfLivingRooms +
                '}';
    }
}

