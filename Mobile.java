package week1.day1;

public class Mobile {
	String mobileModel = "Samsung s20+";
	int mobileWeight = 500;
	boolean isFullyCharge = false;
	double mobileCost = 80000.00125;
			
	public void makeCall() {
		// TODO Auto-generated method stub
System.out.println("Call TestLeaf");
	}
public void sendMsg() {
	// TODO Auto-generated method stub
System.out.println("Send SMS");
}

public static void main(String[] args) {
	Mobile myMobile = new Mobile();
	myMobile.makeCall();
	myMobile.sendMsg();
	System.out.println("MyMobile Model is "+ myMobile.mobileModel);
	System.out.println(myMobile.mobileWeight);
	System.out.println(myMobile.isFullyCharge);
	System.out.println(myMobile.mobileCost);
}
}
	