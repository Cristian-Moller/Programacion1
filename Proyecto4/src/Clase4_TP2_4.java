import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * a. Calcular el número áureo: permite conocer en qué año-tipo del ciclo nos encontramos 
 * considerando la repetición de ciclos cada 19 años.
 * El número áureo se calcula de la siguiente forma:
 * – Tomamos la cifra del año que nos interesa (por ejemplo 2023) y le sumamos 1 (2023+1=2024)
 * – A continuación dividimos el resultado por 19 (ciclo de repetición) y nos quedamos con el 
 * resto 2024/19 = 106 resto = 10 (10 es el resto entre 2024 y 19). Al dividir por 19 hemos 
 * eliminado los ciclos repetidos. Así el número áureo es 10.
 * 
 * Calcular la epacta: es la edad de la luna en días el 1 de enero del año elegido, 
 * y se calcula de la siguiente forma:
 * – Se resta 1 del número áureo, y se multiplica por 11 (en nuestro caso 10-1 = 9; 9*11 = 99)
 * – Después, se divide por 30 (un mes lunar) y de nuevo nos quedamos con el resto: 
 * 99/30 = 3 resto = 9. Significa que el 1 de enero de 2023 habrán pasado 9 días desde la última luna nueva.
 * 
 * Finalmente, para saber la edad lunar en un día cualquiera, (supongamos el 15 de junio de 2023)
 * realizaremos la siguiente operación:
 * 1) A la epacta (9) le sumamos 1 por cada mes a partir de marzo (por ejemplo: de marzo a junio sumamos 4, 
 * y si el mes fuera enero de marzo a enero sumamos 11), y luego le sumamos el día del mes requerido (15), 
 * es decir 9+4+15=28.
 * 2) 28 es la edad lunar para esa fecha, y si pasara de 29 habría que reducirlo obteniendo el resto de dividir por 30.
 * 3) Es decir que el 15 de junio de 2023 habrán pasado 28 días desde la última luna nueva, por lo que la luna será
 * menguante casi nueva (a falta de un día aproximadamente).
 */

public class Clase4_TP2_4 {

	public static void main(String[] args) {
		int dia, mes,anio, rdo, epacta, edad_lunar, edad_lunar1;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un dia: ");
			dia = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un mes: ");
			mes = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un año: ");
			anio = Integer.valueOf(entrada.readLine());


			rdo = (anio+1) % 19;
			System.out.println("1 - Nos encontramos en el numero aureo Nº "+ rdo);
			
			epacta = ((rdo - 1)* 11) % 30;
			System.out.println("2 - Significa que el 1 de enero de "+anio+" habrán pasado "+epacta+" días desde la última luna nueva.");
			
			switch (mes) {
				case 1: case 2:{
					edad_lunar = epacta + (mes+10) + dia;
					if (edad_lunar <=29) {
						System.out.println(edad_lunar + " es la edad lunar para esa fecha");
						if ((edad_lunar >= 1) && (edad_lunar <= 7)) {
							System.out.println("Es luna nueva");
						} else if ((edad_lunar >= 8) && (edad_lunar <= 14)) {
							System.out.println("Es luna cuarto creciente");
						} else if ((edad_lunar >= 15) && (edad_lunar <= 21)) {
							System.out.println("Es luna llena");
						} else if ((edad_lunar >= 22) && (edad_lunar <= 29)) {
							System.out.println("Es luna cuarto menguante");
						}		
						break;
					} else if (edad_lunar > 29){
						edad_lunar1 = edad_lunar % 30;
						System.out.println((edad_lunar1) + " es la edad lunar para esa fecha");
						if ((edad_lunar1 >= 0) && (edad_lunar1 <= 6)) {
							System.out.println("Es luna nueva");
						} else if ((edad_lunar1 >= 7) && (edad_lunar1 <= 13)) {
							System.out.println("Es luna cuarto creciente");
						} else if ((edad_lunar1 >= 14) && (edad_lunar1 <= 20)) {
							System.out.println("Es luna llena");
						} else if ((edad_lunar1 >= 21) && (edad_lunar1 <= 27)) {
							System.out.println("Es luna cuarto menguante");
						}
						break;
					}
				}

				case 3: case 4: case 5: case 6: case 7: case 9: case 8: case 10: case 11: case 12:{
					edad_lunar = epacta + (mes-2) + dia;
					if (edad_lunar <= 29) {
						System.out.println(edad_lunar + " es la edad lunar para esa fecha");
						if ((edad_lunar >= 1) && (edad_lunar <= 7)) {
							System.out.println("Es luna nueva");
						} else if ((edad_lunar >= 8) && (edad_lunar <= 14)) {
							System.out.println("Es luna cuarto creciente");
						} else if ((edad_lunar >= 15) && (edad_lunar <= 21)) {
							System.out.println("Es luna llena");
						} else if ((edad_lunar >= 22) && (edad_lunar <= 29)) {
							System.out.println("Es luna cuarto menguante");
						}
						break;
					} else if (edad_lunar > 29){
						edad_lunar1 = edad_lunar % 30;
						System.out.println((edad_lunar1) + " es la edad lunar para esa fecha");
						if ((edad_lunar1 >= 0) && (edad_lunar1 <= 6)) {
							System.out.println("Es luna nueva");
						} else if ((edad_lunar1 >= 7) && (edad_lunar1 <= 13)) {
							System.out.println("Es luna cuarto creciente");
						} else if ((edad_lunar1 >= 14) && (edad_lunar1 <= 20)) {
							System.out.println("Es luna llena");
						} else if ((edad_lunar1 >= 21) && (edad_lunar1 <= 27)) {
							System.out.println("Es luna cuarto menguante");
						}
						break;
					}
				}
				default: {
					System.out.println("El numero seleccionado no corresponde a un mes");
				}
			}
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}
