package com.hp.bb;

public class Phone {
    private static Phone ourInstance = new Phone();

    public static Phone getInstance() {
        return ourInstance;
    }

    private Phone() {
    }
}
