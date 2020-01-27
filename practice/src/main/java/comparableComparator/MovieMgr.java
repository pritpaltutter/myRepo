package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieMgr {

    public static void main(String[] args) {
        RatingComparator rt = new RatingComparator();
        List<Movie> movieList = new ArrayList<Movie>();

        movieList.add(new Movie(1,"Dragon"));
        movieList.add(new Movie(23,"Enter Dragon"));
        movieList.add(new Movie(3,"Into Dragon"));
        movieList.add(new Movie(42,"Under Dragon"));
        movieList.add(new Movie(5,"Outer Dragon"));
        movieList.add(new Movie(63,"Inside Dragon"));
        movieList.add(new Movie(7,"Hidden Dragon"));
        movieList.add(new Movie(81,"Red Dragon"));

        Collections.sort(movieList,rt);

        for (Movie movie:
                movieList) {
            System.out.println(movie);
        }

    }
}
