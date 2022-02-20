public interface JsoupCurrency {
    double getUSD();
    void setUSD(double value);

    String convertAmount(double amount, String fromCurrency, String toCurrency);

}
