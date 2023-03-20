package polymorphism;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTv(1) ��ü ����");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> SetSpeaker ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> SetPrice ȣ��");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
	}
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
