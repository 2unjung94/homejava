package pra02_Parking;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Parking {

  // field
  private String name;
  private Map<Integer, Vehicle> vehicles;

  
  // constructor
  public Parking(String name) {
    this.name = name;
     vehicles = new HashMap<Integer, Vehicle>();
  }
  
  // method
  // 고용
  public void park(Vehicle vehicle) throws RuntimeException {
    
    // 예외 발생시 null 이 넘어온다.
    if(vehicle == null) {
      throw new RuntimeException("차 정보가 올바르지 않습니다.");
    }
 
    if(vehicles.containsValue(vehicle)) {
        throw new RuntimeException("이미 주차중인 차량 입니다.");
      
    }
    vehicles.put(vehicle.getLocation(), vehicle);
    
  }
  
  // 해고
  public void exit(int location) throws RuntimeException{
    
    if(vehicles == null) {
      throw new RuntimeException("출차할 차가 없습니다.");
    }
    
    Set<Integer> keySet = vehicles.keySet();
    for (Integer key : keySet) {  
     if(key == location) {
       vehicles.remove(key);
     }
    }
    
  }
    
  
  
  // 조회
  public void search(int location) {
    //1. for문 사용시 삭제 for문 복사해서 remove 대신 출력 넣어주면 된다
    //2. 객체 비교 : 전달받은 empNo에 대한 객체를 만들어 equals override 비교
    //          ㄴ : Employee 클래스에서 hashCode()/equals() override 추가
    
    if(vehicles==null) {
      throw new RuntimeException("조회할 차가 없습니다.");
    }
    Set<Integer> keySet = vehicles.keySet();
    for (Integer key : keySet) {  
      System.out.println(keySet.toString());
     if(key == location) {
       vehicles.get(key).info();
     }
    }
    
    
  }
  
  // 전체 조회
  public void searchAll() throws RuntimeException {
    
    if(vehicles==null) {
      throw new RuntimeException("조회할 차가 없습니다.");
    }

    System.out.println("전체 주차 현황");
    System.out.println("-------------------");
    Set<Integer> keySet = vehicles.keySet();
    for (Integer key : keySet) {  
      vehicles.get(key).info();
      System.out.println("-------------------");
    }

    }

    
    
  

}
