package org.example;

public class FilterTest {
    public static void main(String[] args) throws YearFilterException,CityFilterException, UnknownException {
        YearCityFilter yearCityFilter=new YearCityFilter();

        try {
            yearCityFilter.yearCityParam("2025","Ankara");
        } catch (YearFilterException y) {
            System.out.println(y.getMessage());
        }

        try {
            yearCityFilter.yearCityParam("2024","İzmir");
        }catch (CityFilterException c){
            System.out.println(c.getMessage());
        }

        try {
            yearCityFilter.yearCityParam("2024","Ankara");
        }catch (UnknownException u){
            System.out.println(u.getMessage());
        }
    }
}
