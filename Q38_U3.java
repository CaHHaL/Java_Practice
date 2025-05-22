// Rohan is developing a Movie Rating System where each movie has a unique ID and a user-given rating. Some movies are verified for accuracy. He designed two classes: Movie and RatedMovie. The Movie class stores the ID and rating, overrides toString() to return "Movie {movieId} Rating: {rating}", and overrides equals() to compare movies by ID and rating. The RatedMovie class extends Movie and overrides toString() to prepend "[Verified]" before the details, distinguishing verified movies.

// Input format :
// The first line consists of an integer 'n' representing the number of movies.

// The next line consists of n space-separated integers representing the ratings of each movie.

// Output format :
// The first line of output prints "Movie Ratings:".

// The second line of output prints the details of each verified movie in the format:

// "[Verified] Movie {movieId} Rating: {rating}"



// ﻿Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 10

// 0 ≤ Rating ≤ 10



// Sample test cases :
// Input 1 :
// 3
// 4.5
// 3.8
// 5.0
// Output 1 :
// Movie Ratings:
// [Verified] Movie 1 Rating: 4.5
// [Verified] Movie 2 Rating: 3.8
// [Verified] Movie 3 Rating: 5.0
// Input 2 :
// 2
// 2.5
// 4.2
// Output 2 :
// Movie Ratings:
// [Verified] Movie 1 Rating: 2.5
// [Verified] Movie 2 Rating: 4.2



class Movie {
    protected int movieId;
    protected double rating;

    // Constructor to initialize movie ID and rating
    public Movie(int movieId, double rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    // Overriding toString() to return movie details
    @Override
    public String toString() {
        return "Movie " + movieId + " Rating: " + rating;
    }

    // Overriding equals() to compare movies by ID and rating
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return movieId == movie.movieId && Double.compare(movie.rating, rating) == 0;
    }
}

// Derived class: RatedMovie (Verified movies)
class RatedMovie extends Movie {
    // Constructor calls the base class constructor
    public RatedMovie(int movieId, double rating) {
        super(movieId, rating);
    }

    // Overriding toString() to prepend "[Verified]"
    @Override
    public String toString() {
        return "[Verified] " + super.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numMovies = scanner.nextInt();
        
        Movie[] movies = new Movie[numMovies];
        
        for (int i = 0; i < numMovies; i++) {
            double rating = scanner.nextDouble();
            movies[i] = new RatedMovie(i + 1, rating);
        }
        
        System.out.println("Movie Ratings:");
        for (Movie movie : movies) {
            if (movie instanceof RatedMovie) {
                System.out.println(movie);
            }
        }
        
        scanner.close();
    }
}