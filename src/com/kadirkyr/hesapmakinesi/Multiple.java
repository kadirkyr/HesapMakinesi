package com.kadirkyr.hesapmakinesi;

public class Multiple extends Operations{
    @Override
    public double operation(int s1, int s2) {
        return s1*s2;
    }

    @Override
    public double operation(int s1, int s2, int s3) {
        return s1*s2*s3;
    }
}
