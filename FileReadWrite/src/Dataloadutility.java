import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dataloadutility {
	
	public Dataloadutility() {
		
		
	}
	
	Scanner s;
	File input;
	List<Vehicle> vehicles = new ArrayList<>();
	String recordfields[];
	
	public List<Vehicle> load() {
		input= new File("input.txt");
		try {
			s=new Scanner(input);
			while(s.hasNextLine()) {
				String line =s.nextLine();
				System.out.println(" # "+ line);
				
				String recordfields[] = line.split(",");
				vehicles.add(new Vehicle(recordfields[0],recordfields[1]));
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println(" ");
			
			System.out.println(" ");
			for(Vehicle vehicles :vehicles) {
				System.out.println("* " + vehicles.getBrand()+" has "+vehicles.getModel());
			}
			
		}
		return vehicles;
	}
	
	
	
}