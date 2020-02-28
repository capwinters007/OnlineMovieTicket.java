
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service service =new Service();
		ArrayList<Movie> list=new ArrayList<>();
		//ArrayList<Movie> list2=new ArrayList<>();
		
		try {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			boolean flag=true;
			int choice;
			while(flag) {
				try {
				System.out.println("Enter your choice as\n1)To Enter new movie details\n2)To display all movie details\n3)To search movie details\n4)To delete movie details\n5)To exit");
				choice=Integer.parseInt(br.readLine());
				switch(choice) {
				case 1:
					list.add(service.insert());
					break;
				case 2:
					service.display(list);
					break;
				case 3:
					service.search(list);
					break;
				case 4:
					list.remove(service.delete(list));
					break;
				case 5:
					flag=false;
					break;
				default:
					throw new NumberFormatException();
					
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Wrong choice entered!!!");
			}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
