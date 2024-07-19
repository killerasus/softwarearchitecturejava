package com.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CSVParser> parsers = new ArrayList<>();
        parsers.add(new RealEstateMarketDataParser());
        parsers.add(new MachineLearningDataParser());
        parsers.add(new StockMarketAdapter(new StockMarketDataParser()));

        for(CSVParser parser : parsers)
            parser.parseCSV();
    }
}