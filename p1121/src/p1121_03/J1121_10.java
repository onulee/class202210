package p1121_03;

public class J1121_10 {

	public static void main(String[] args) {
		String str =  String.format("%05d", 121);
		int num = 1; //
		int num2 =121;
		int num3 = 1234;
		
		System.out.println(String.format("stu%05d", num));   // s200001 s201 + 1
		System.out.println("s"+num2);
		System.out.println("s"+num3);

	}

}
