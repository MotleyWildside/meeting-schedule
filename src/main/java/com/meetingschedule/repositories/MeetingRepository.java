package com.meetingschedule.repositories;

import com.meetingschedule.models.Meeting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingRepository {
    public static List<Meeting> meetings = new ArrayList<Meeting>();

    public static void addNewMeeting(Date date, String department, String meetingRoom) {
        meetings.add(new Meeting(date, department, meetingRoom));
    }

    public static void deleteMeeting(int index) {
        meetings.remove(index);
    }
}
