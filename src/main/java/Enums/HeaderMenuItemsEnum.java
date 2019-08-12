package Enums;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum HeaderMenuItemsEnum {

    TRANSFER_FUNDS("transfer_funds_tab");

    private final String text;

    private HeaderMenuItemsEnum(final String text) {
        this.text = text;
    }

    private static Map<String, HeaderMenuItemsEnum> values = populateMap();

    private static Map<String, HeaderMenuItemsEnum> populateMap() {
        Map<String, HeaderMenuItemsEnum> valuesMap = new HashMap<>();
        HeaderMenuItemsEnum[] values = values();
        Stream.of(values).forEach(x -> valuesMap.put(x.text, x));
        return valuesMap;
    }

    @Override
    public String toString() {
        return text;
    }

    public static HeaderMenuItemsEnum parse(String text) {
        if (!values.containsKey(text)) {
            throw new IllegalArgumentException("text");
        }
        return values.get(text);
    }

}
