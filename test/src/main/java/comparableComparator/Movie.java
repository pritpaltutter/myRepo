package comparableComparator;

import java.util.Comparator;

public class Movie {
    int rating;
    String name;

    public Movie(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }
}
