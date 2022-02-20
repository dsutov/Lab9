import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CurrencyConverter2 {

    public String convertAmount(double amount, String fromCurrency, String toCurrency) {
        try {
            Document doc = Jsoup.connect(String.format("https://www.xe.com/currencyconverter/convert/?Amount=%f&From=%s&To=%s", amount, fromCurrency, toCurrency)).get();

            Elements elements = doc.select("p");
            //System.out.println(elements);
            for (Element element : elements) {
                //System.out.println(element);
                String classes = element.className();
                if(classes.contains("result__BigRate"))
                {
                    return element.text();
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return "ERROR";
    }
}
