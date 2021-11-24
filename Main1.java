package ecomHomeWork241121;

//6.	א. צור משתנה int בשם "k "ותן לו את הערך 5
//צור פונקציה בשם "changeNumber "המקבלת מספר (INT) ומגדילה אותו ב-1 . 
public class Main1 {

	public static void main(String[] args) {
		int k=5;
		System.out.println(k+" =before sending to function");
	System.out.println(changeNumber(k));	

	}

	public static int changeNumber (int n) {
		return n+1;
	}
}
