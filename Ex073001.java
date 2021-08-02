
public class Ex073001 { // 앞서 입력한 car.java의 내용을 **상속받아 해당 파일에서 작업

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색깔 : "+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
	
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+myCar.speed);
	
	}

}
