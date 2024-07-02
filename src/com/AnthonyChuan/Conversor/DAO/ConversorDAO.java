package com.AnthonyChuan.Conversor.DAO;

import java.util.Map;

public record ConversorDAO(String base_code, String target_code, double conversion_rate) {


    @Override
    public String base_code() {
        return base_code;
    }

    @Override
    public String target_code() {
        return target_code;
    }

    @Override
    public double conversion_rate() {
        return conversion_rate;
    }
}
