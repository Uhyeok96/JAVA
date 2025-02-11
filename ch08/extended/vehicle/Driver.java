package ch08.extended.vehicle;

public class Driver {
	// 운전자 서비스 클래스
	
	public void drive(Vehicle vehicle) {
		// Vehicle vehicle = new Vehicle();
		vehicle.name = "탈것";
		vehicle.run();
		
		Bus bus = (Bus) vehicle; //(Bus) 강제타입변환
		bus.name = "시내버스";
		bus.type = "전기형";
		bus.buscard();
		
		Taxi taxi = (Taxi) vehicle; // (Taxi) 강제타입변환
		taxi.model = "카카오택시";
		taxi.name = "가스형";
		taxi.meter();
	}
}
