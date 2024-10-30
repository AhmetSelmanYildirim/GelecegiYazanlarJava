public class Phone {

	PhoneType type;
	String marka;
	String model;
	boolean wifi;
	boolean mobileData;
	
	boolean isCalling;
	
	void call(String phoneNumber) {
		System.out.println(phoneNumber+" aranıyor");
		isCalling = true;
	}
	void endCall() {
		if(isCalling) {
			System.out.println("Arama sonlandırıldı");
			isCalling = false;
		}
	}
	void sendMessage(String message) {
		if(mobileData || wifi) {
			System.out.println("mesaj gönderildi.");
		}
	}
	
}
