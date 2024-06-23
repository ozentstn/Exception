package org.example;

public class YearCityFilter {
    public void yearCityParam(String year, String cityName) throws YearFilterException, CityFilterException , UnknownException{
        String currentYear="2024";
        String trueCityName="Ankara";

        if(!year.equals(currentYear)){
            throw new YearFilterException("Hatalı yıl girdiniz...");
        }

        if (!cityName.equals(trueCityName)){
            throw  new CityFilterException("Hatalı il girdiniz...");
        }

        if (year.equals(currentYear) && cityName.equals(trueCityName)){
            throw  new UnknownException("Bilinmeyen hata...");
        }
    }
}
