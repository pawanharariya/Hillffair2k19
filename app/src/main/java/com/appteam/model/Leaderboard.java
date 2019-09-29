package com.appteam.model;


/**
 * Created by LENOVO on 26-09-2018.
 */
public class Leaderboard {

    String name;
    int candies;
    String gender;


    public Leaderboard(String name, int candies, String gender) {
        this.name = name;
        this.gender = gender;
        this.candies = candies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCandies() {
        return candies;
    }

    public void setCandies(int candies) {
        this.candies = candies;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
