package ecomHomeWork241121;

//כתוב פונקציה שמקבלת שלושה מספרים ומחזירה את הממוצע שלהם.
// – על מנת להחזיר ערך מפונקציה השתמשו ב-return.

public class main6 {

	public static void main(String[] args) {
		System.out.println(avg(2, 6, 6));

	}

	public static double avg(int a,int b,int c) {
		
		double sum=a+b+c;
		 double avg=sum/3;
		return avg;
		
	}
}
