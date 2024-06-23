package org.example;

 class YearFilterException extends Exception{
    public YearFilterException(String yearMessage){
        super(yearMessage);
        //System.out.println(yearMessage);
    }
}

class CityFilterException extends Exception{
     public CityFilterException(String cityMessage){
         super(cityMessage);
        // System.out.println(cityMessage);
     }
}

class UnknownException extends Exception{
     public UnknownException(String unkMessage){
         super(unkMessage);
         //System.out.println(unkMessage);
     }
}
