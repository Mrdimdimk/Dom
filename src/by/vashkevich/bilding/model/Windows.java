package by.vashkevich.bilding.model;

import java.util.Scanner;

public class Windows {
public String color;
public int type;

public Windows(String color, int type){
	this.color = color;
	this.type = type;
}


public static int ReadCountWindow(){
	Scanner cs = new Scanner(System.in);
	int countWindow = cs.nextInt() ;
	return countWindow;
}

public String ReadColorWindow(){
	Scanner cs = new Scanner(System.in);
	String colorWindow = cs.next() ;
	return colorWindow;
}
public int ReadTypeWindow(){
	Scanner cs = new Scanner(System.in);
	int typeWindow = cs.nextInt() ;
	return typeWindow;

}

}

