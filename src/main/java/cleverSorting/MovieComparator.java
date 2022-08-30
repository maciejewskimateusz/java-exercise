package cleverSorting;

import java.util.Comparator;

public enum MovieComparator {
    TITLE("Title", Comparator.comparing(Movie::getTitle)),
    RATING("Rating", Comparator.comparing(Movie::getRating).reversed()),
    YEAR("Year", Comparator.comparing(Movie::getYear));

    private String criteria;
    private Comparator<Movie> comparator;

    MovieComparator(String criteria, Comparator<Movie> comparator) {
        this.criteria = criteria;
        this.comparator = comparator;
    }

    public String getCriteria() {
        return criteria;
    }

    public Comparator<Movie> getComparator() {
        return comparator;
    }


}
