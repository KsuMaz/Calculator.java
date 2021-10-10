package com.company;

public class Calculator {

    public static String plus(String x, String y) throws Exception {
        String plus = "";
        if(checkNum(x) && checkNum(y)) {
            plus = Converter.arabToRome(Converter.romeToArab(x) + Converter.romeToArab(y));
        } else if(!checkNum(x) && !checkNum(y)) {
            if(Integer.parseInt(x) > 10 || Integer.parseInt(y) > 10) {
                throw new Exception("Числа больше 10");
            }
            plus = String.valueOf(Integer.parseInt(x) + Integer.parseInt(y));
        } else {
            throw new Exception("Неверный ввод данных");
        }
        return plus;
    }

    public static String minus(String x, String y) throws Exception {
        String minus = "";
        if(checkNum(x) && checkNum(y)) {
            if(Integer.parseInt(x) > 10 || Integer.parseInt(y) > 10) {
                throw new Exception("Числа больше 10");
            }
            minus = Converter.arabToRome(Converter.romeToArab(x) - Converter.romeToArab(y));
        } else if(!checkNum(x) && !checkNum(y)) {
            minus = String.valueOf(Integer.parseInt(x) - Integer.parseInt(y));
        } else {
            throw new Exception("Неверный ввод данных");
        }
        return minus;
    }

    public static String mult(String x, String y) throws Exception {
        String mult = "";
        if(checkNum(x) && checkNum(y)) {
            if(Integer.parseInt(x) > 10 || Integer.parseInt(y) > 10) {
                throw new Exception("Числа больше 10");
            }
            mult = Converter.arabToRome(Converter.romeToArab(x) * Converter.romeToArab(y));
        } else if(!checkNum(x) && !checkNum(y)) {
            mult = String.valueOf(Integer.parseInt(x) * Integer.parseInt(y));
        } else {
            throw new Exception("Неверный ввод данных");
        }
        return mult;
    }

    public static String div(String x, String y) throws Exception {
        String div = "";
        if(checkNum(x) && checkNum(y)) {
            if(Integer.parseInt(x) > 10 || Integer.parseInt(y) > 10) {
                throw new Exception("Числа больше 10");
            }
            div = Converter.arabToRome(Converter.romeToArab(x) / Converter.romeToArab(y));
        } else if(!checkNum(x) && !checkNum(y)) {
            div = String.valueOf(Integer.parseInt(x) / Integer.parseInt(y));
        } else {
            throw new Exception("Неверный ввод данных");
        }
        return div;
    }


    public static boolean checkNum(String x) {
        return "IIVIIIX".contains(x);
    }

}

