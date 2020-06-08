package com.meetingschedule.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Meeting {
    public Date date;
    public String department;
    public String meetingRoom;

    public Meeting() {}

    public Meeting(Date date, String department, String meetingRoom) {
        this.date = date;
        this.department = department;
        this.meetingRoom = meetingRoom;
    }
}
