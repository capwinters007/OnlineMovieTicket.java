import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Service implements IService{

	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	public Movie insert() {
		Movie m=new Movie();
		try {
			ArrayList<String>al=new ArrayList<>();
			ArrayList<Integer> al2=new ArrayList<>();
			ArrayList<String> al3=new ArrayList<>();
			ArrayList<Integer> al4=new ArrayList<>();
			
			System.out.println("Enter the name of the movie");
			m.setMovieName(br.readLine());
			
			System.out.println("Enter the movie ID");
			m.setMovieId(Integer.parseInt(br.readLine()));
			
			System.out.println("Enter the show genre seperated by commas");
			String str=br.readLine();
			StringTokenizer st=new StringTokenizer(str,",");
			while(st.hasMoreTokens()) {
				al.add(st.nextToken());
			}
			m.setMovieGenre(al);
			
			System.out.println("Enter the name of movie director");
			m.setMovieDirector(br.readLine());
			
			System.out.println("Enter the screen time of movie in the format hh:mm:ss");
			str=br.readLine();
			st=new StringTokenizer(str,":");
			while(st.hasMoreTokens()) {
				al2.add(Integer.parseInt(st.nextToken()));
			}
			m.setMovieLength(LocalTime.of((int)al2.get(0),(int)al2.get(1),(int)al2.get(2)));
			
			System.out.println("Enter the languages of the movie released in seperated by commas.");
			str=br.readLine();
			st=new StringTokenizer(str,",");
			while(st.hasMoreTokens()) {
				al3.add(st.nextToken());
			}
			m.setLanguages(al3);
			
			System.out.println("Enter the release date of the movie in the format hh/mm/yyyy");
			str=br.readLine();
			st=new StringTokenizer(str,"/");
			while(st.hasMoreTokens()) {
				al4.add(Integer.parseInt(st.nextToken()));
			}
			m.setReleaseDate(LocalDate.of((int)al4.get(2), (int)al4.get(1),al4.get(0)));
			
			return m;
		}
		catch(Exception e) {
			System.out.println("Enter the details in correct format");
			return null;
		}
	}
	
	
	public void display(ArrayList<Movie> list) {
		
		if(list.isEmpty())
			System.out.println("No data found!!");
		else {
			Iterator<Movie> it=list.iterator();
			while(it.hasNext()) {
				Movie m=it.next();
				System.out.println("Movie ID: "+m.getMovieId());
				System.out.println("Movie Name: "+m.getMovieName());
				ArrayList<String> al=m.getMovieGenre();
				System.out.print("Genre: ");
				for(int i=0;i<al.size();i++) {
					System.out.print(al.get(i)+" ");
				}
				System.out.print("\n");
				System.out.println("Movie Director: "+m.getMovieDirector());
				System.out.println("Movie Length: "+m.getMovieLength());
				System.out.print("Languages: ");
				al=m.getLanguages();
				for(int i=0;i<al.size();i++)
					System.out.print(al.get(i)+" ");
				System.out.print("\n");
				System.out.println("Release Date: "+m.getReleaseDate());
				System.out.println("--------------------------------------------------------");
			}
		}
		
	}
	
	public void search(ArrayList<Movie> list) {
		System.out.println("Enter the movie name to search by");
		boolean flag=false;
		ArrayList<Movie> al=new ArrayList<>();
		try {
		String str=br.readLine();
		if(list.isEmpty())
			System.out.println("Empty movie list!!");
		else {
			Iterator<Movie> it=list.iterator();
			while(it.hasNext()) {
				Movie m=it.next();
				if((m.getMovieName()).equalsIgnoreCase(str)) {
					al.add(m);
					flag=true;
			}
				if(flag==true)
					display(al);
				else
					System.out.println("No data found!!");
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Movie delete(ArrayList<Movie> list) {
		Movie m=new Movie();
		boolean flag=false;
		if(list.isEmpty()) {
			System.out.println("No Movie details present!!");
			return null;
		}else {
			try {
				System.out.println("Enter the movie name to delete by");
				String str=br.readLine();
				Iterator<Movie> it=list.iterator();
				while(it.hasNext()) {
					m=it.next();
					if(m.getMovieName().equalsIgnoreCase(str)) {
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println("File deleted successfully!!");
					return m;
				}
				else {
					System.out.println("No data found!!!");
					return null;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
	}
	
}
