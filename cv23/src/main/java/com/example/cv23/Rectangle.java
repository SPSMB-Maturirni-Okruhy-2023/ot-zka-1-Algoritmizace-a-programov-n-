package com.example.cv23;

public class Rectangle {
    double x = 100;
    double y = 100;


    public void up(){
        --y;
    }
    public void down(){
        ++y;
    }

    public void left(){
        x--;
    }

    public void right(){
        x++;
    }

}
