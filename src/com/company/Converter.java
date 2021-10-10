package com.company;

import java.util.Locale;

public class Converter {

    public static String arabToRome(int num) throws Exception {
        if(num < 0) {
            throw new Exception("Ошибка ввода");
        }
        return getNumber(num);
    }

    public static int romeToArab(String number) throws Exception {
        int x = switch (number.toUpperCase(Locale.ROOT)) {
            case "I" -> x = 1;
            case "II" -> x = 2;
            case "III" -> x = 3;
            case "IV" -> x = 4;
            case "V" -> x = 5;
            case "VI" -> x = 6;
            case "VII" -> x = 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new Exception("Ошибка ввода");
        };
        return x;
    }

    private static String getNumber(int num) {
        StringBuilder romeNumber = new StringBuilder("");
        for(int i = Numbers.values().length-1; i > 0; i--){
            while(true) {
                if ((num - Numbers.values()[i].getX()) >= 0) {
                    romeNumber.append(Numbers.values()[i]);
                    num -= Numbers.values()[i].getX();
                    if (num == 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return romeNumber.toString();
    }




}


