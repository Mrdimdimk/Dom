package by.vashkevich.bilding.runner;

import by.vashkevich.bilding.model.Dors;
import by.vashkevich.bilding.model.Windows;
import by.vashkevich.bilding.model.bilding;
import by.vashkevich.bilding.model.message;

public class MainApp {

	public static void main(String[] args) {
		
		bilding  DOM = new bilding();
		
		DOM.privetstvie();
		DOM.vvediteKolichestvoDverei();
		int countDor = Dors.ReadCountDors();
		DOM.vvediteKolichestvoOkon();
		int countWind = Windows.ReadCountWindow();
		DOM.setDors(countDor);
		//System.out.println(countDor);
		DOM.Closedor();
		
		
		
		
		

	}

}
