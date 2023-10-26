package logic;

public class Tulip extends Item {

    public Tulip() {
        description = "Tulip: 65 UAH";
    }

    @Override
    public double price() {
        return 65;
    }
}
