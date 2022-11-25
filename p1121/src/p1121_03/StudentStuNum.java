package p1121_03;

import java.util.Comparator;

public class StudentStuNum implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.stuNum.compareTo(o2.stuNum);
	}

}
