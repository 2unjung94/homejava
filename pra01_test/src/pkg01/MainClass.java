package pkg01;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Map<Integer, TestClass> map = new HashMap<Integer, TestClass>();
    TestClass person1 = new TestClass("abc", 10);
    TestClass person2 = new TestClass("def", 20);
    TestClass person3 = new TestClass("ghi", 30);

    map.put(1, person1);
    map.put(2, person2);
    map.put(3, person3);
    
    String abc = "abc";
    map.forEach((key, value) -> { 
      System.out.println(abc.equals(value.getName()));
//      if(carNo.equals(value.getVehicleNo())) {
//        System.out.println("자동차 위치를 선택해주세요>>>");
//        Scanner sc = new Scanner(System.in);
//        int location = sc.nextInt();
//        sc.close();
//        vehicles.remove(location);
//      }

    });
    map.remove(1);
   
    
  }
  

}
