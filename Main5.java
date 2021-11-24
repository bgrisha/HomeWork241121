package ecomHomeWork241121;

//13.	צור משפחה של פונקציות (השתמש ב - (overloadingבשם "numberType "אשר מקבלות 
public class Main5 {

	public static void main(String[] args) {
		
		numberType(5.5);
		numberType(5);
		numberType(4.1f);

	}
public static void numberType (int n) {
	System.out.println("type of number is int");
}
public static void numberType (float n) {
	System.out.println("type of number is float ");
}
public static void numberType (double n) {
	System.out.println("type of number is double ");
}

}
