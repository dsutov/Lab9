public class CurrencyConverter implements BaseCurrency {
    private double usd = 0.0;

    /*
        this method returns the current value to usd
     */
    @Override
    public double getUSD() {
        return usd;
    }

    /*
        this method sets usd to the input value without making changes
     */
    @Override
    public void setUSD(double value) { //
        usd = value;
    }

    /*
        this method converts euro to usd by multiplying the input value by 1.14
    */
    @Override
    public void euroToUSD(double value) {
        usd = value * 1.14;
    }

    /*
        this method converts usd to euro by dividing usd by 1.14
     */
    @Override
    public double usdToEuro() {
        return usd / 1.14;
    }

    /*
        this method converts gbp to usd by multiplying the input value by 1.367
     */
    @Override
    public void gbpToUSD(double value) {
        usd = value * 1.367;
    }

    /*
        this method converts usd to gbp by dividing usd by 1.367
     */
    @Override
    public double usdToGBP() {
        return usd / 1.367;
    }

    /*
        this method converts yuan to usd by multiplying the input value by 0.157
    */
    @Override
    public void yuanToUSD(double value) {
        usd = value * 0.157;
    }

    /*
        this method converts usd to yuan by dividing usd by 0.157
     */
    @Override
    public double usdToYuan() {
        return usd / 0.157;
    }

    public static void main(String[] args) {
        // the main method tests if all the methods work
        CurrencyConverter c = new CurrencyConverter();

        c.euroToUSD(50);
        System.out.println("The value in USD is: " + c.getUSD());
        c.setUSD(1000);
        System.out.println("The value in Euro is: " + c.usdToEuro());

        c.gbpToUSD(50);
        System.out.println("The value in USD is: " + c.getUSD());
        c.setUSD(1000);
        System.out.println("The value in GBP is: " + c.usdToGBP());

        c.yuanToUSD(50);
        System.out.println("The value in USD is: " + c.getUSD());
        c.setUSD(1000);
        System.out.println("The value in Yuan is: " + c.usdToYuan());
    }
}

