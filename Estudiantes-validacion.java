package empresa;

import javax.swing.JOptionPane;

public class Proyecto {

	public static void main(String[] args) {
		try {
		int tamanio = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de usuarios"));

		int[] edades = new int[tamanio];
		String[] discapacidades = new String[tamanio];
		double[] estaturas = new double[tamanio];
		String[] nombres = new String[tamanio];
		String[] generos = new String[tamanio];
		double[] pesos = new double[tamanio];


			if (tamanio == 0) {

			} else {

				ingresarInformacion(edades, discapacidades, estaturas, nombres, generos, pesos);
				int menu = Integer.parseInt(JOptionPane
						.showInputDialog("Ingrese una opcion \n"
								+ "1- ver lista de nombres primos \n"
								+ "2- resumen promedio de los pesos \n"
								+ "3- resumen promedio de las estaturas \n"
								+ "4- ver cantidad de usuarios\n"
								+ "5- resumen promedio de las edades\n"
								+ "6- resumen promedio de las discapacidades\n"
								+ "7- ver los nombres palindromos\n"
								+ "8- ver nombre con mas vocales"));
				switch (menu) {
				case 1:
					verListaNombresPrimos(edades, nombres);
					break;

				case 2:
					resumirPromediosPesos(pesos, generos);
					break;

				case 3:
					resumirPromediosEstaturas(estaturas, generos);
					break;

				case 4:
					contarUsuarios(nombres, generos);
					break;

				case 5:
					resumirEdadPromedio(edades, generos);
					break;
				case 6:
					resumirDiscapacidades(discapacidades, generos);
					break;
				case 7:
					encontrarPalindromo(nombres);
					break;
				case 8:
					ordInscNameAlfa(nombres);
					break;
				default:
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}

	}

	public static int ingresarInformacion(
			int[] edades,
			String[] discapacidades, 
			double[] estaturas, 
			String[] nombres,
			String[] generos, 
			double[] pesos) {
		
		int acumulador = 0;

		for (int i = 0; i < discapacidades.length; i++) {
			String nombre = JOptionPane.showInputDialog("Ingrese Nombre");
			String genero = JOptionPane.showInputDialog("Ingrese el genero f(femenino) m(masculino):");

			String discapaciodad = JOptionPane
					.showInputDialog("ingrese discapasidad (si) o (no)");
			int edad = Integer.parseInt(JOptionPane
					.showInputDialog("ingrese edad"));
			double peso = Double.parseDouble(JOptionPane
					.showInputDialog("ingrese peso"));
			double estatura = Double.parseDouble(JOptionPane
					.showInputDialog("ingrese Estatura"));
			edades[acumulador] = edad;
			discapacidades[acumulador] = discapaciodad;
			pesos[acumulador] = peso;
			estaturas[acumulador] = estatura;
			generos[acumulador] = genero;
			nombres[acumulador] = nombre;
			acumulador++;
		}
		return nombres.length;
	}

	public static boolean obtenereUnPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

	public static void verListaNombresPrimos(int [] edades,String []nombres) {
		System.out.println("******edades con # Primos******");
		for (int i = 0; i < edades.length; i++) {
			if (obtenereUnPrimo(edades[i])) {
				System.out.println("nombre: " + nombres[i] + " Edad: " + edades[i]);
			}
		}
	}

	public static void resumirPromediosPesos(double[] pesos, String[] generos) {

		double numeroDeElementos = 0;
		for (int i = 0; i < pesos.length; i++) {
			if (pesos[i] != 0) {
				numeroDeElementos++;
			}
		}
		int cantidad = 0;
		for (int i = 0; i < pesos.length; i++) {
			cantidad += pesos[i];
		}

		int cantidadDeHombres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("m")) {
				cantidadDeHombres++;
			}
		}
		int pesoHombres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("m")) {
				pesoHombres += pesos[i];
			}
		}

		int cantidadDeMujeres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("f")) {
				cantidadDeMujeres++;
			}
		}
		int pesoMujeres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("f")) {
				pesoMujeres += pesos[i];
			}
		}

		double promedioMujeres = pesoMujeres / cantidadDeMujeres;
		double promedioHombres = pesoHombres / cantidadDeHombres;
		double promedioPeso = cantidad / numeroDeElementos;
		System.out.println("\n\n*****promedio de pesos*****");
		System.out.println(" el promedio de pesos es: " + promedioPeso);
		System.out.println("\n\n*****promedio de pesos Hombres y Mujeres*****");
		System.out.println(" el promedio de los pesos Hombres: "
				+ promedioHombres);
		System.out.println("\n el promedio de los pesos Mujeres: "
				+ promedioMujeres);
	}

	public static void resumirPromediosEstaturas(double [] estaturas, String [] generos) {
		double numeroDeEstaturas = 0;
		for (int i = 0; i < estaturas.length; i++) {
			if (estaturas[i] != 0) {
				numeroDeEstaturas++;
			}
		}
		int cantidad = 0;
		for (int i = 0; i < estaturas.length; i++) {
			cantidad += estaturas[i];
		}

		int cantidadDeHombres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("m")) {
				cantidadDeHombres++;
			}
		}
		int estaturaHombres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("m")) {
				estaturaHombres += estaturas[i];
			}
		}

		int cantidadDeMujeres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("f")) {
				cantidadDeMujeres++;
			}
		}
		int estaturaMujeres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("f")) {
				estaturaMujeres += estaturas[i];
			}
		}

		double promedioEstaturaMujeres = estaturaMujeres / cantidadDeMujeres;
		double promedioEstaturaHombres = estaturaHombres / cantidadDeHombres;
		double promedioEstatura = cantidad / numeroDeEstaturas;
		System.out.println("\n\n*****promedio de estaturas*****");
		System.out.println(" el promedio de estaturas es: " + promedioEstatura);
		System.out
				.println("\n\n*****promedio de estauras Hombres y Mujeres*****");
		System.out.println(" el promedio de los estatura Hombres: "
				+ promedioEstaturaHombres);
		System.out.println("\n el promedio de los estatura Mujeres: "
				+ promedioEstaturaMujeres);
	}

	public static void contarUsuarios(String [] nombres , String [] generos) {
		int cantidadDeUsuarios = 0;
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i] != "") {
				cantidadDeUsuarios++;
			}
		}
		int numeroTotalMujeres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("f")) {
				numeroTotalMujeres++;
			}
		}
		int numeroTotalHombres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("m")) {
				numeroTotalHombres++;
			}
		}
		System.out.println("\n\n*****cantidad de usuarios*****");
		System.out.println("la cantidad es:" + cantidadDeUsuarios);
		System.out.println("\n\n*****numero total de Hombres y Mujeres*****");
		System.out.println(" numero total de Hombres: " + numeroTotalHombres);
		System.out.println("\n numero total de Mujeres: " + numeroTotalMujeres);
	}

	public static void resumirEdadPromedio(int [] edades, String [] generos) {
		double numeroDeEdad = 0;
		for (int i = 0; i < edades.length; i++) {
			if (edades[i] != 0) {
				numeroDeEdad++;
			}
		}
		int contador = 0;
		for (int i = 0; i < edades.length; i++) {
			contador += edades[i];
		}

		int cantidadDeHombres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("m")) {
				cantidadDeHombres++;
			}
		}
		int edadHombres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("m")) {
				edadHombres += edades[i];
			}
		}

		int cantidadDeMujeres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("f")) {
				cantidadDeMujeres++;
			}
		}
		int edadMujeres = 0;
		for (int i = 0; i < generos.length; i++) {
			if (generos[i].equalsIgnoreCase("m")) {
				edadMujeres += edades[i];
			}
		}

		double promedioEdadMujeres = edadMujeres / cantidadDeMujeres;
		double promedioEdadHombres = edadHombres / cantidadDeHombres;
		double promedioEdad = contador / numeroDeEdad;
		System.out.println("\n\n*****promedio de edades*****");
		System.out.println(" el promedio de edades es: " + promedioEdad);
		System.out
				.println("\n\n*****promedio de edades Hombres y Mujeres*****");
		System.out.println(" el promedio de las edades Hombres: "
				+ promedioEdadHombres);
		System.out.println("\n el promedio de las edades Mujeres: "
				+ promedioEdadMujeres);
	}

	public static void resumirDiscapacidades(String []discapacidades,String [] generos) {
		
		int numeroDiscapacidad = 0;
		for (int i = 0; i < discapacidades.length; i++) {
			if (discapacidades[i].equalsIgnoreCase("si")) {
				numeroDiscapacidad++;
			}
		}

		int numeroDiscapacidadHombres = 0;
		for (int i = 0; i < discapacidades.length; i++) {
			if (discapacidades[i].equalsIgnoreCase("si")
					&& generos[i].equalsIgnoreCase("m")) {
				numeroDiscapacidadHombres++;
			}
		}

		int numeroDiscapacidadMujeres = 0;
		for (int i = 0; i < discapacidades.length; i++) {
			if (discapacidades[i].equalsIgnoreCase("si")
					&& generos[i].equalsIgnoreCase("f")) {
				numeroDiscapacidadMujeres++;
			}
		}

		System.out.println("\n\n*****numero de discapacidades*****");
		System.out.println("el numero de personas con discapacidades es: "
				+ numeroDiscapacidad);
		System.out
				.println("\n\n*****numero de discapacidades de hombres y mujeres*****");
		System.out.println("el numero de hombres con discapacidades es: "
				+ numeroDiscapacidadHombres);
		System.out.println("\n el numero de mujeres con discapacidades es: "
				+ numeroDiscapacidadMujeres);
	}

	public static void encontrarPalindromo(String [] nombres) {
		for (int i = 0; i < nombres.length; i++) {

			String tem = nombres[i];

			String tem2 = "";

			for (int j = tem.length() - 1; j >= 0; j--) {

				tem2 += tem.charAt(j);

			}

			if (tem.equals(tem2)) {
				System.out.println("*****nombres que son palindromos*****");
				System.out.println(nombres[i]);

			}
		}
	}

	public static void mostrarUsuarioMasVocales(String [] nombres) {
		int contador = 0;
		for (int i = 0; i < nombres.length; i++) {

			String tem = nombres[i];

			for (int j = 0; j < tem.length(); j++) {
				if ((tem.charAt(j) == 'a') || (tem.charAt(j) == 'e')
						|| (tem.charAt(j) == 'i') || (tem.charAt(j) == 'o')
						|| (tem.charAt(j) == 'u')) {
					contador++;
				}
			}
		}
	}

	static void ordInscNameAlfa(String [] nombres) {
		int contador;

		for (int i = 1; i < nombres.length; i++) {
			String aux = nombres[i];
			contador = i; // inicia el desplazamiento en i

			while (contador > 0 && nombres[i].compareTo(aux) > 0) {
				nombres[contador] = nombres[contador - 1]; // desplaza el
															// elemento hacia la
															// derecha
				--contador;
			}

			nombres[contador] = aux; // inserta elemento
		}
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}

	}

}