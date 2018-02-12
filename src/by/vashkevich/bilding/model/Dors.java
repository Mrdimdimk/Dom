package by.vashkevich.bilding.model;

import java.util.Scanner;



public class Dors {
	public static String color;
	public static int type;

	public Dors(String color, int type){
		this.color = color;
		this.type  = type;
	}
	
	public static int ReadCountDors(){
		Scanner cs = new Scanner(System.in);
		int countDors = cs.nextInt() ;
		return countDors;
	}
	
	public  static String ReadColorDors(){
		Scanner cs = new Scanner(System.in);
		String colorDors = cs.next() ;
		return colorDors;
	}
	public int ReadTypeDors(){
		Scanner cs = new Scanner(System.in);
		int typeDors = cs.nextInt() ;
		return typeDors;
	
}

}

	

