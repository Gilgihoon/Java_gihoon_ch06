
public class Car {
//�ʵ�
	String company = "�����ڵ���"; // �������� �� ���, String(����)�����̶� null ǥ�õ�
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	
	Car() {
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}