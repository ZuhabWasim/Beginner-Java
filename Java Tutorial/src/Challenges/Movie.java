package Challenges;

public class Movie {

	private String title;
	private String genre;
	private String director;
	private String year;
	private String[] cast;
	private String runtime;
	
	//Getters
	public String getTitle() {
			return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getYear() {
		return year;
	}
	
	public String[] getCast() {
		return cast;
	}
	
	public String getRuntime() {
		return runtime;
	}
	
	//Setters
	public void setTitle(String value) {
			this.title = value;
	}
	
	public void setGenre(String value) {
		this.genre = value;
	}
	
	public void setDirector(String value) {
		this.director = value;
	}
	
	public void setYear(String value) {
		this.year = value;
	}
	
	public void setCast(String value[]) {
		this.cast = value;
	}
	
	public void setRuntime(String value) {
		this.runtime = value;
	}
	
	public static void main(String[] args) {
		
		setTitle("The Imitation Game");
		
	}

}
