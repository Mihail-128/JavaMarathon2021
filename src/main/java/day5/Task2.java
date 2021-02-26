package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2014, "Red", "Yamaha");
        System.out.println(motorbike.getYearOfRelease());
        System.out.println(motorbike.getColour());
        System.out.println(motorbike.getModel());
    }
}

class Motorbike {
    private int yearOfRelease;
    private String colour;
    private String model;

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public Motorbike(int yearOfRelease, String colour, String model) {
        this.yearOfRelease = yearOfRelease;
        this.colour = colour;
        this.model = model;

    }
}
