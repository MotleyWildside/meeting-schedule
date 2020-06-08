package com.meetingschedule;

import com.meetingschedule.models.Meeting;
import com.meetingschedule.repositories.MeetingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Date;


@SpringBootApplication
@AutoConfigurationPackage
public class MeetingScheduleApplication {
	public static void main(String[] args) {
		SpringApplication.run(MeetingScheduleApplication.class);
	}

}
