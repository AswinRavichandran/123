package week1.day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=524658595l;
	boolean isPunctured=false;
	String bikeName="Royal enfield";
	double runningKm=5622.544;
	public static void main(String[] args) {
		TwoWheeler vehicle=new TwoWheeler();
		System.out.println(vehicle.bikeName);
		System.out.println(vehicle.noOfWheels);
		System.out.println(vehicle.runningKm);
		System.out.println(vehicle.isPunctured);
		System.out.println(vehicle.chassisNumber);
		System.out.println(vehicle.noOfMirrors);
	}

}
