import java.sql.Timestamp;

public class Probe {

	public static void main(String[] args) {
	
		getToday();

	}

	private static void getToday(){
		Timestamp timestamp= Util.getToday();
		System.out.println(timestamp);
		Timestamp timestamp2= Util.getToday();
		System.out.println(timestamp2);
		System.out.println(timestamp.compareTo(timestamp2));
		System.out.println(timestamp2.compareTo(timestamp));
	}
}
