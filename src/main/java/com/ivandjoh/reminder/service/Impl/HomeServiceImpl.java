package com.ivandjoh.reminder.service.Impl;

import com.ivandjoh.reminder.http.HomeRequest;
import com.ivandjoh.reminder.http.HomeResponse;
import com.ivandjoh.reminder.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    private final Logger log = LoggerFactory.getLogger(HomeServiceImpl.class);

    @Override
    public ResponseEntity<?> setReminder(HomeRequest time) {

        HomeResponse response = new HomeResponse();
        response.setTime(time.getTime());
        response.setMessage("Reminder has been set for " + time.getTime());

        log.info("Reminder set for " + time);

        return ResponseEntity
                .status(200)
                .body(response);
    }
}
