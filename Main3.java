package ecomHomeWork241121;

import java.util.Scanner;

//9.	כתוב פונקציה שמקבלת מערך מסוג int ומספר, בודקת האם המספר נמצא בתוך המערך, ומחזירה true  או false.

public class Main3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		int my_array [] ={1,2,3,4,5,6,7,8,9,10};
		
		checkArray(number, my_array);

	}
public static void checkArray(int n,int[]arr) {
	boolean exist=false;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==n) {
			exist=true;
			
		}
	}System.out.println(exist);
}
}
