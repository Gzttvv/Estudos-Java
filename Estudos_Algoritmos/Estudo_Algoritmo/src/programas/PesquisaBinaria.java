package programas;

public class PesquisaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int baixo, alto,meio,chute,item,lista;
		int [] minhalista = new int[10];
		
		baixo = 0 ;
		alto = minhalista.length-1;
		meio = (baixo+alto) / 2 ;
		chute = minhalista[meio];
		
		item = 7;
		
		if (chute < item) {
			baixo = meio +1;
		} 
		

	}
	
	
	

}
