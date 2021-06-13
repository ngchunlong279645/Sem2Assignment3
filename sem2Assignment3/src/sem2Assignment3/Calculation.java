package sem2Assignment3;

public class Calculation {

	public double totalPrice(double price, int quantity) {	//constructor with 2 argument
		if(quantity<=2) {
			double totalPrice=price*quantity;
			return totalPrice;
		}
		else if(quantity>2&&quantity<=4) {
			double newPrice=2.00;
			double totalPrice=newPrice*quantity;
			return totalPrice;
		}
		else {
			double newPrice=1.50;
			double discount=0.10;
			double totalPrice=(newPrice*quantity)*(1-discount);
			return totalPrice;
		}	
	
	}
}
