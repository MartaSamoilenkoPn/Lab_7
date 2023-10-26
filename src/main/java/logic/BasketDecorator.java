package logic;

public class BasketDecorator extends ItemDecorator {

    @Override
    double price() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Basket: 10 UAH";
    }
}
