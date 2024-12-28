package utils;

public class GenericUtils {

    public static String cleanAmountString(String amount) {
        return amount.replace(",", "").replace("USD", "").trim();
    }
}
