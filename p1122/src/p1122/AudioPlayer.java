package p1122;

public class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("audio를 재생합니다.");

	}

	@Override
	void stop() {
		System.out.println("audio를 멈춥니다.");

	}

}
