package com.company;
import java.util.Scanner;

public class Mod {
    String name;
    int Inn;
    public Mod(String name,int inn)
    {
        this.name = name;
        this.Inn = inn;
    }
    public int getInn()
    {
        return Inn;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
