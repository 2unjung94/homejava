package pra02_Parking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Truck extends Vehicle{
  
  // field
  private int vehicleNo;
  private int location;

  // constructor
  public Truck(int vehicleNo, int location) {
    super(vehicleNo, location);
    // TODO Auto-generated constructor stub
  }

  // method
  @Override
  public void info() {
    super.info();
  }

  
  
}
