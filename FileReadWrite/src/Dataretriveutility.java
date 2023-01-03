import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dataretriveutility {

	public Dataretriveutility() {
		// TODO Auto-generated constructor stub
	}
	
	FileWriter writer;
	File output;
	
	public void retrieval(List<Vehicle>vehicles) {
		try {
			writer = new FileWriter("output.txt");
			
			
			List<Vehicle> List = new ArrayList<>();
			List=vehicles;
			System.out.print(List.size());
			for(Vehicle vehicle: List)  {
				writer. write(  "Brand: " +vehicle.getBrand() + " has " + "Model: " + vehicle.getModel()+ System. lineSeparator());
			}
			writer.close();
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

}
}
