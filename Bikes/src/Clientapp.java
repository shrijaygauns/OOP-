import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class Clientapp {
 public static void main (String [] args) {
	 
	 

	 {
			System.out.println("--------PreownedBikes.com--------");
			
			Map<String,String> map = new HashMap<String, String>();
			map.put("1","Xpulse");
			
			map.put("2","Xtreme");
			
			map.put("3","Glamour");
			
			map.put("4","Passion");
			
			Set<String> keys = map.keySet();
			for(String key : keys) {
				System.out.println(key + "   " + map.get(key));
			}
		}
	 
	 
  Xpulse hero= new Xpulse("4V","GA03A2734","Shri",80);
  hero.getModelName();
  hero.getRegistrationNumber();
  hero.getOwnerName();
  hero.getSpeed();
  
  
  
  System.out.println();
  
  Xtreme hero1 = new Xtreme("X411","GA04T7898","Ved",100);
  hero1.getModelName();
  hero1.getRegistrationNumber();
  hero1.getOwnerName();
  hero1.getSpeed();
 
  
  System.out.println();
  
  Glamour hero2 = new Glamour("Glam66","GA08D4545","Shreya",100);
  hero2.getModelName();
  hero2.getRegistrationNumber();
  hero2.getOwnerName();
  hero2.getSpeed();
 
  
  System.out.println();
  
  Passion hero3= new Passion("ProV","GA05A8834","Vignesh",110);
  hero3.getModelName();
  hero3.getRegistrationNumber();
  hero3.getOwnerName();
  hero3.getSpeed();
  
  
  
  System.out.println();
  
}
 
 
}
