package pra02_Parking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car extends Vehicle {
  
  // field
  private int vehicleNo;
  private int location;
 
  // constructor
  public Car(int vehicleNo, int location) {
    super(vehicleNo, location);
  }
  
  // method
 
  @Override
  public void info() {
    super.info();       // 사원번호, 사원이름 출력하는 부모 메소드 호출
  }
  
}
