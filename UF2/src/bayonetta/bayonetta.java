package bayonetta;

import java.util.Scanner;

/**
 * Clase per calcular la puntuaci� que fa la Bayonetta durant un combo.
 * Has d'introduir un n�mero d'enemics i un altre de cops per realitzar el c�lcul.
 * 
 * @author Daniel Leiva
 * @version 1.0
 * 
 */
public class bayonetta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double enemics = sc.nextInt();
		double cops = sc.nextInt();
		double aux = cops;
		double punts = 0;
		double dany = 10;
		double acc = 1;
		System.out.println(combo(enemics, cops, dany, acc, punts, aux));	
	}
	
	/**
	 * Funci� encarregada de calcular els punts obtinguts per un combo.
	 * La funci� acumula els punts obtinguts pel dany de cada cop, el dany es multiplica cada cop que
	 * colpegem i despr�s et retorna el resultat de multiplicar els punts obtinguts per l'acumulador
	 * el qual incrementa 0.2 per cada enemic derrotat.
	 * 
	 * @param enemics Quantitat d'enemics derrotats durant el combo
	 * @param cops Quantit de cops necessaris per derrotar a un enmic
	 * @param dany Punts obtinguts per cada cop
	 * @param acc Multiplicador de punts
	 * @param punts Punts obtinguts durant el combo
	 * @param aux Auxiliar per restablir el numero de cops al derrotar un enemic
	 * @return retorna la puntuaci� total del combo donada per la multiplicaci� dels punts per l'acumulador
	 */
	public static long combo(double enemics, double cops, double dany, double acc, double punts, double aux){
		while(enemics > 0){
			punts += dany;
			dany *= 2;
			cops--;
			if(cops == 0){
				cops = aux;
				enemics--;
				acc += 0.2;
			}
		}
		return (long)(punts*acc);
	}
}
