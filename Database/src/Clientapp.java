import java.util.ArrayList;
import java.util.List;

public class Clientapp {

	
		// TODO Auto-generated constructor stub
		
		
		public static void main(String[] args) {
			
			Dataload load = new Dataload();
			List<Vehicle> list = new ArrayList<>();
			list=load.load();
			
			Dataretrive retrive = new Dataretrive();
			retrive.retrieval(list);
		
	}

}

