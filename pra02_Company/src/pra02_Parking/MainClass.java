package pra02_Parking;

public class MainClass {

  public static void main(String[] args) {
    
    Parking company = new Parking("park1");
    
    new ParkingHandler(company).manage();

  }

}