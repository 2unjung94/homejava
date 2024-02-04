package pra02_Parking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParkingHandler {
  
  // field
  private Scanner sc;
  private Parking parking;
  
  // constructor
  public ParkingHandler(Parking parking) {
    sc = new Scanner(System.in);
    this.parking = parking;
  }
  
  // method
  // 사원 정보 입력
  // InputMis어쩌구는 내가 메시지를 직접 작성할 수 없다.
  private Vehicle getVehicle() throws InputMismatchException, RuntimeException {
    
    System.out.println("차량(1.승용차 2.트럭) 입력 >>>");
    String type = sc.next();
    
    System.out.println("차량번호 입력 >>> ");
    int vehicleNo = sc.nextInt();
    
    System.out.println("주차위치 입력 >>> ");
    int location = sc.nextInt();
    
    switch(type) {
    case "1":
      System.out.println("주차완료되었습니다");
      return new Car(vehicleNo, location);
    case "2":
      System.out.println("주차완료되었습니다");
      return new Truck(vehicleNo, location);
    default:
      throw new RuntimeException("잘못된 입력입니다. 다시 입력해주세요");
    }
    
  }
  
  // 차량 번호 입력
  private int getVehicleNo() throws InputMismatchException{
    
    System.out.println("주차위치 >>> ");
    return sc.nextInt();
  
  }
  
  // 주차 관리
  public void manage() {
      
    System.out.println("===== 주차관리 프로그램 시작 =====");
    while(true) {
      
      try {
        System.out.println("\n1.주차 2.출차 3.조회 4.전체조회 0.프로그램 종료 >>>");
        String choice = sc.next();
        switch(choice) {
        case "1": 
          parking.park(getVehicle());
          break;
        case "2":
          parking.exit(getVehicleNo());
          break;
        case "3":
          parking.search(getVehicleNo());
          break;
        case "4":
          parking.searchAll();
          break;
        case "0":
          System.out.println("===== 주차관리 프로그램 종료 =====");
          return;
        default:
          throw new RuntimeException("잘못된 입력입니다.");
        }  
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }


}
