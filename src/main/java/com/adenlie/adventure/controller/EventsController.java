package com.adenlie.adventure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/events")
@ResponseBody
public class EventsController {

    @RequestMapping(value = "/all.json", method = GET)
    public String getEvents() {
        return "listing all events";
    }

}