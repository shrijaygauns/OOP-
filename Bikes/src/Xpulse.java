

public class Xpulse extends Herobike  {
 public int Speed;
 private String ModelName;
 private String RegistrationNumber;
 private String OwnerName;
 
 public Xpulse(String ModelName, String RegistrationNumber,String OwnerName, int Speed ) {
  super();
  this.ModelName=ModelName;
  this.RegistrationNumber=RegistrationNumber;
  this.OwnerName=OwnerName;
  this.Speed=Speed;
  
 }
 

@Override
 public void getModelName() {
  System.out.println("Model Name= "+ModelName);
 }
 @Override
 public void getRegistrationNumber() {
  System.out.println("Registration Number= "+RegistrationNumber);
 }
 @Override
 public void getOwnerName() {
  System.out.println("Owner Name= "+OwnerName);
 }
 public void getSpeed() {
  System.out.println("Speed= "+Speed);
 }
 
 

}