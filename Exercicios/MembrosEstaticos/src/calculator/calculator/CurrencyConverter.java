package calculator;

public class CurrencyConverter {

    public double price;
    public double bought;
    public double reais;

    public static final double iof = 0.06;

    public double amountReais() {
        return (price * bought) * (1 + iof);
    }
}
