package util;

public class CurrentyConverter {
	
	public static double dolarReal(double cotDolar,double quntDolar) {
		return (cotDolar * quntDolar) ;
	}
	public static double Iof(double cotDolar,double quntDolar) {
		return (quntDolar * 0.06) * cotDolar;
	}
	
	
}
