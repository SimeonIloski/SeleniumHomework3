package Enums;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum TransferFundsAccountTypesEnum {

    CHECKING_ACCOUNT("Checking"),
    CREDIT_CARD_ACCOUNT("Credit");

    private final String text;


    private TransferFundsAccountTypesEnum(final String text) {
        this.text = text;
    }

    private static Map<String, TransferFundsAccountTypesEnum> values = populateMap();

    private static Map<String, TransferFundsAccountTypesEnum> populateMap() {
        Map<String, TransferFundsAccountTypesEnum> valuesMap = new HashMap<>();
        TransferFundsAccountTypesEnum[] values = values();
        Stream.of(values).forEach(x -> valuesMap.put(x.text, x));
        return valuesMap;
    }

    @Override
    public String toString() {
        return text;
    }

    public static TransferFundsAccountTypesEnum parse(String text) {
        if (!values.containsKey(text)) {
            throw new IllegalArgumentException("text");
        }
        return values.get(text);
    }

}
