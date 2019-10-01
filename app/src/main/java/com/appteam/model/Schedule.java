package com.appteam.model;

/**
 * Coded by ThisIsNSH on 9/20/2018.
 */

public class Schedule {

    String clubName;
    String eventName;
    String event_id;
    String time;
    String date;

    public Schedule(String clubName, String eventName, String event_id, String time, String date) {
        this.clubName = clubName;
        this.eventName = eventName;
        this.event_id = event_id;
        this.time = time;
        this.date = date;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
