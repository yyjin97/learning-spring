package com.learning.converterformatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventController {

    @GetMapping("/event/{event}")
    public @ResponseBody String getEvent(@PathVariable Event event) {
        System.out.println(event);
        return event.getId().toString();
    }
}
