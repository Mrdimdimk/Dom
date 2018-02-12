package by.vashkevich.bilding.model;

public class bilding {
	public String matrial;
	public String floor;
	public Windows[] Window;
	public Dors[] Dor;

	public void privetstvie() {
		System.out.println(" Hi ! ");
	}

	public void vvediteKolichestvoDverei() {
		System.out.println(" Введите количество дверей ");
	}

	public void vvediteKolichestvoOkon() {
		System.out.println(" Введите количество окон ");
	}

	public void setDors(int countDors) {
		if (countDors > 0) {
			int count = countDors;
//			Dor = new Dors[countDors];
//			for (int i = 0; i < countDors; i++) {
//				Dor[i] = i++;
			}
		}



	public int DorsCount() {

		int count = 0;
		int countDors = 0;
		for (int n = 0; n < Dor.length; n++)
			if (countDors != 0) {
				count++;
			}
		return count;
	}
	public void Closedor(){
		System.out.println("Закрыто " + DorsCount() + "двери");
		
	}

}
