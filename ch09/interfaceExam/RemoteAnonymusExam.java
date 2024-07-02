package ch09.interfaceExam;

public class RemoteAnonymusExam {
	// 인터페이스를 구현클래스로 사용하지 않고 인터페이스만으로 실행한다.
	
	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl() {
			int volume;

			@Override
			public void turnoff() {
				System.out.println("익명으로 전원을 끕니다.");

			}

			@Override
			public void turnOn() {
				System.out.println("익명으로 전원을 켭니다.");

			}

			@Override
			public void setVolume(int volume) {

				if (volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				} // if 종료
				System.out.println("현재 익명 객체의 볼륨 : " + volume);

			}
		};
	}
}
