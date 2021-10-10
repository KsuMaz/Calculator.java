package com.company;

public enum Numbers {
    I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100);


    private int x;
    Numbers(int x) {
        this.x = x;
    }



    public int getX() {
        return x;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
