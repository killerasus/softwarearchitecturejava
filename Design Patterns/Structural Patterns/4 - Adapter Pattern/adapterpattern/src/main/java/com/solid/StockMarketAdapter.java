package com.solid;

public class StockMarketAdapter implements CSVParser {

    private StockMarketDataParser stockMarketParser;

    public StockMarketAdapter(StockMarketDataParser parser){
        stockMarketParser = parser;
    }

    @Override
    public void parseCSV() {
        stockMarketParser.parseXML();
    }

}
