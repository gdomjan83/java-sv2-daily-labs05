package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> moviesPlaying = new ArrayList<>();
        for (Movie actual : movies) {
            if (checkCalendar(actual, time) != null) {
                moviesPlaying.add(checkCalendar(actual, time));
            }
        }
        return moviesPlaying;
    }

    private String checkCalendar(Movie movie, LocalDateTime time) {
        for (LocalDateTime currentTime : movie.getCalendar()) {
            if (String.valueOf(currentTime).equals(String.valueOf(time))) {
                return movie.getName();
            }
        }
        return null;
    }
}
