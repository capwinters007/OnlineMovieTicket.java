import java.util.ArrayList;

public interface IService {

	public Movie insert();
	public void display(ArrayList<Movie> list);
	public void search(ArrayList<Movie> list);
	public Movie delete(ArrayList<Movie> list);
	
}
