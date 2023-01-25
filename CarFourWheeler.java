package week1.day1;

public class CarFourWheeler {
	public void applyBreak() {
		System.out.println("Apply The Breaks");
	}
	public void applyGear() {
		System.out.println("Apply the fourth gear");
	}
	public static void  switchOnAc() {
		System.out.println("On The AC");
	}
	public static void applyAcclerate( ) {
		System.out.println("Apply The Acclerate");
	}
	public void onTheIndicator() {
		System.out.println("Put The Right Indicator");
	}
	public static void engineStart() {
		System.out.println("Start The Engine");
	}
	public static void fillPetrol() {
		System.out.println("Fill The Petrol Tank");
		}
	public void theSeatBelt() {
		System.out.println("Wear The Seat Belts");
	}
	public void applyHandBreak() {
		System.out.println("Apply The Hand Break");
	}
	
	public static void main(String[] args) {
		CarFourWheeler alto=new CarFourWheeler();
		alto.applyBreak();
		alto.applyGear();
		switchOnAc();
		applyAcclerate();
		alto.onTheIndicator();
		engineStart();
		fillPetrol();
		alto.theSeatBelt();
		alto.applyHandBreak();
		
	}

}
