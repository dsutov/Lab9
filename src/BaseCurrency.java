public interface BaseCurrency {
    double getUSD();
    void setUSD(double value);

    void euroToUSD(double value);
    double usdToEuro();

    void gbpToUSD(double value);
    double usdToGBP();

    void yuanToUSD(double value);
    double usdToYuan();


    /*
        USD == USD
        Euro == EUR
        Pounds == GBP
        Yuan == CNY
     */
}
