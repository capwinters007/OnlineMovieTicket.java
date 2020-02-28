import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Movie {

	private int movieId;
	private String movieName;
	private ArrayList<String> movieGenre;
	private String movieDirector;
	private LocalTime movieLength;
	private ArrayList<String> languages;
	private LocalDate releaseDate;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public ArrayList<String> getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(ArrayList<String> movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public LocalTime getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(LocalTime movieLength) {
		this.movieLength = movieLength;
	}
	public ArrayList<String> getLanguages() {
		return languages;
	}
	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	
}
