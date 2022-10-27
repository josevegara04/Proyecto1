package proyecto1;
import java.util.Scanner;

public class Principal 
{
	public static void main(String[] args)
	{
		//Atributos
		int posAnadirCarros = 0;
		int modelo;
		int num = 500;
		int cantidadVehiculos = 0;
		int cantidadSensores = 0;
		String marca;
		double valorComercial;
		String color;
		Vehiculo carro;
		String infoVehiculos;
		String infoSensores;
		String tipo;
		double valor;
		int posAnadirSensores = 0;
		Sensor sen;
		
		Vehiculo[] vehiculos = new Vehiculo[10];
		Sensor[] sensores = new Sensor[8];
		Scanner scan = new Scanner(System.in);
		
		//Inicio del ciclo
		boolean salir = false;
		while(!salir)
		{
			Principal.mostrarMenu();
			num = scan.nextInt();
			
			switch(num)
			{
				case 0:
					salir = true; 
					System.out.println("Programa finalizado");
					break;
				case 1:
					if(posAnadirCarros <= 9)
					{
						System.out.println("Ingrese el modelo: ");
						modelo = scan.nextInt();
						System.out.println("Ingrese la marca: ");
						marca = scan.next();
						System.out.println("Ingrese el valor comercial");
						valorComercial = scan.nextDouble();
						System.out.println("Ingrese el color");
						color = scan.next();
						carro = new Vehiculo(modelo, marca, valorComercial,color);
						vehiculos[posAnadirCarros] = carro;
						posAnadirCarros = posAnadirCarros + 1;
						System.out.println("Información registrada");
					}
					else
					{
						System.out.println("Lista de vehiculos llena");
					}
					break;
				case 2:
					infoVehiculos = "";
					for(int i = 0; i < vehiculos.length; i = i + 1)
					{
						carro = vehiculos[i];
						if(carro != null)
						{
							infoVehiculos = infoVehiculos + "/ Vehiculo " + i + ": " + carro.toString()+	'\n';
						}
						else
						{
							break;
						}
					}
					System.out.println("Información de Vehiculos: ");
					System.out.println(infoVehiculos);
					break;
				case 3:
					for(int i = 0; i < vehiculos.length; i = i + 1)
					{
						carro = vehiculos[i];
						if(carro != null)
							{
								cantidadVehiculos = cantidadVehiculos + carro.cantidadVehiculos(carro);
							}
					}
					System.out.println("Cantidad de vehiculos ingresados: ");
					
					System.out.println(cantidadVehiculos);
					break;
				case 4:
					infoVehiculos = "";
					System.out.println("Información de Vehiculos: ");
					for(int i = 0; i < vehiculos.length; i = i + 1)
					{
						carro = vehiculos[i];
						if(carro != null && carro.getColor().equalsIgnoreCase("verde"))
						{
							infoVehiculos = "/ Vehiculo " + i + ": " + carro.toString();
							System.out.println(infoVehiculos);
						}
					}
					break;
				case 5:
					infoVehiculos = "";
					System.out.println("Información de Vehiculos: ");
					for(int i = 0; i < vehiculos.length; i = i + 1)
					{
						carro = vehiculos[i];
						if(carro != null && 2000 <= carro.getModelo() && carro.getModelo() <= 2021)
						{
							infoVehiculos = "/ Vehiculo " + i + ": " + carro.toString();
							System.out.println(infoVehiculos);
						}
					}
					break;
				case 6:
					System.out.println("Ingrese el tipo de sensor: ");
					tipo = scan.next();
					System.out.println("Ingrese el valor del sensor: ");
					valor = scan.nextDouble();
					sen = new Sensor(tipo, valor);
					sensores[posAnadirSensores] = sen;
					posAnadirSensores = posAnadirSensores + 1;
					System.out.println("Información registrada");
					break;
				case 7:
					infoSensores = "";
					for(int i = 0; i < sensores.length; i = i + 1)
					{
						sen = sensores[i];
						if(sen != null)
						{
							infoSensores = infoSensores + "/ Sensor " + i + ": " + sen.toStringSensores() + "\n";
						}
						else
						{
							break;
						}
					}
					System.out.println("Información de Sensores: ");
					System.out.println(infoSensores);
					break;
				case 8: 
					for(int i = 0; i < sensores.length; i = i + 1)
					{
						sen = sensores[i];
						if(sen != null)
							{
								cantidadSensores = cantidadSensores + sen.cantidadSensores(sen);
							}
					}
					System.out.println("Cantidad de sensores ingresados: ");
					System.out.println(cantidadSensores);
					break;
				case 9:
					infoSensores = "";
					for(int i =0; i < sensores.length; i = i + 1)
					{
						sen = sensores[i];
						if(sen != null && sen.getTipo().equalsIgnoreCase("temperatura"))
						{
							infoSensores = "/ Sensor " + i + ": " + sen.toStringSensores();
							System.out.println(infoSensores);
						}
					
					}
					break;
				default:
					System.out.println("Opción invalida");
			}
		}
	}
	
	public static void mostrarMenu()
	{
		System.out.println("Si ingresas 0, el programa finaliza");
		System.out.println("Si ingresas 1, ingresaras las caracteristicas del vehículo");
		System.out.println("Si ingresas 2, verás la información de todos los vehículos hasta el momento");
		System.out.println("Si ingresas 3, verás la cantidad de vehículos que hay hasta el momento");
		System.out.println("Si ingresas 4, verás la información de todos vehículos de color verde");
		System.out.println("Si ingresas 5, verás todos los vehículos que sean entre modelo 2000 y 2021");
		System.out.println("Si ingresas 6, tendrás que ingresar 2 parametros de sensor");
		System.out.println("Si ingresas 7, verás la información de todos los sensores que hay hasta el momento");
		System.out.println("Si ingresas 8, verás la cantidad de sensores que hay hasta el momento");
		System.out.println("Si ingresas 9, verás la información de todos los sensores que sean de tipo temperatura");
	}
}
