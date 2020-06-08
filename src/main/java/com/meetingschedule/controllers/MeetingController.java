package com.meetingschedule.controllers;

import com.meetingschedule.models.Meeting;
import com.meetingschedule.repositories.MeetingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8081")
@RestController
public class MeetingController {

    @CrossOrigin("http://localhost:8081")
    @RequestMapping(value = "/create-meeting", method = RequestMethod.POST)
    public void createMeeting(@RequestBody Meeting meeting) {
        MeetingRepository.addNewMeeting(meeting.date, meeting.department, meeting.meetingRoom);
    }

    @CrossOrigin("http://localhost:8081")
    @RequestMapping(value = "/get-meetings", method = RequestMethod.GET)
    public List<Meeting> getMeetings() {
        return MeetingRepository.meetings;
    }

    @CrossOrigin("http://localhost:8081")
    @RequestMapping(value = "/delete-meeting/{index}", method = RequestMethod.DELETE)
    public void deleteMeetings(@PathVariable int index) {
        MeetingRepository.deleteMeeting(index);
    }
}
