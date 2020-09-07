package com.learning.converterformatter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class EventFormatter implements Formatter<Event> {
    @Override
    public Event parse(String s, Locale locale) throws ParseException {         //String -> Event
        return new Event(Integer.parseInt(s));
    }

    @Override
    public String print(Event event, Locale locale) {           //Event -> String
        return event.getId().toString();
    }
}
