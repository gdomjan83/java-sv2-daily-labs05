package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private List<LocalDateTime> calendar = new ArrayList<>();

    public Movie(String name, List<LocalDateTime> calendar) {
        this.name = name;
        this.calendar = calendar;
    }

    public String getName() {
        return name;
    }

    public List<LocalDateTime> getCalendar() {
        return calendar;
    }
}
