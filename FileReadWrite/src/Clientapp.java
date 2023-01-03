import java.util.ArrayList;
import java.util.List;

public class Clientapp {

	
		// TODO Auto-generated constructor stub
		
		public static void main(String[] args) {
			
			Dataloadutility load = new Dataloadutility();
			List<Vehicle> list = new ArrayList<>();
			list=load.load();
			
			Dataretriveutility retrive = new Dataretriveutility();
			retrive.retrieval(list);
			
		}
	}


