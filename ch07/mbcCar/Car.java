package ch07.mbcCar;

import ch07.hankook.SnowTire;
import ch07.hyndai.Engine;
import ch07.kumho.EcoTire;
import ch07.nexen.*; // 넥센에서 만든 클래스는 모두 가져올 수 있음


//import ch07.hankook.Tire;
//import ch07.kumho.Tire;

public class Car {
	// 필드
	ch07.hankook.Tire hTire = new ch07.hankook.Tire(); // 한국타이어 패키지에서 가져옴. import ch07.hankook.Tire;
	ch07.kumho.Tire kTire = new ch07.kumho.Tire(); // 금호타이어 패키지에서 가져옴.
	SnowTire stire = new SnowTire();
	EcoTire etire = new EcoTire();
	
	BigWidthTire bTire = new BigWidthTire();
	SportTire spTire = new SportTire();
	
	Engine hEngine = new Engine();
	
	
	
	// 생성자
	
	
	// 메서드
}
