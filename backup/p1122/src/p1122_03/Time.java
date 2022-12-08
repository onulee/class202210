package p1122_03;

public class Time {
	private int hour;
	private int minute;
	int second;
	
	Time(){
		this(12,12,12);
	}
	Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		
		this.hour = hour;
	}
	

}
