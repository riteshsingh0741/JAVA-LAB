package lab3;

public class Movie {
    private String movieTitle;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String movieTitle, String genre, int duration, double rating) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public void displayMovieTitle() {
        System.out.println("Movie Title: " + movieTitle);
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", "Sci-Fi", 148, 8.8);
        Movie m2 = new Movie("Titanic", "Romance", 195, 7.8);

        System.out.println("Movie Titles:");
        m1.displayMovieTitle();
        m2.displayMovieTitle();
    }
}
