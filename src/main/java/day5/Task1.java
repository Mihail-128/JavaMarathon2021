package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfRelease(1987);
        car.setColour("Black");
        car.setModel("Ford");
        System.out.println(car.getYearOfRelease());
        System.out.println(car.getColour());
        System.out.println(car.getModel());
    }
}

class Car {
    private int yearOfRelease;
    private String colour;
    private String model;

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
