package pra02_Parking;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vehicle {

  // field
  private int vehicleNo;
  private int location;


  // method 
  
  public void info() {
    System.out.println("차량번호 : " + vehicleNo);
    System.out.println("주차위치 : " + location);
  }


  @Override
  public int hashCode() {
    return Objects.hash(vehicleNo);
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Vehicle other = (Vehicle) obj;
    return vehicleNo == other.vehicleNo;
  }


  

}
