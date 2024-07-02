package com.AnthonyChuan.Conversor.DAO;

import java.util.Map;

public record ConversorDAO(String base_code, Map<String, Double> conversion_rates) {
    @Override
    public String base_code() {
        return base_code;
    }

    @Override
    public Map<String, Double> conversion_rates() {
        return conversion_rates;
    }
}
