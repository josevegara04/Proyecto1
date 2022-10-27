package proyecto1;

public class Vehiculo 
{
	public int tamano = 10;
	public int posAnadir = 0;
	private int modelo;
	private String marca;
	private double valorComercial;
	private String color;
	private int cantidad = 0;
	Vehiculo[] vehiculos = new Vehiculo[10];
	
	//constructores
	public Vehiculo()
	{
		
	}
	public Vehiculo(int mo, String ma, double va)
	{
		this.modelo = mo;
		this.marca = ma;
		this.valorComercial = va;
		this.color = "verde";
	}
	public Vehiculo(int mo, String ma, double va, String co)
	{
		this.modelo = mo;
		this.marca = ma;
		this.valorComercial = va;
		this.color = co;
	}
	
	//metodo toString
	public String toString()
	{
		String infoUni = this.modelo+", "+this.marca+", "+this.valorComercial+", "+this.color;
		return infoUni;
	}
	
	//getters
	public int getModelo()
	{
		return this.modelo;
	}
	public String getMarca()
	{
		return this.marca;
	}
	public double getValorComercial()
	{
		return this.valorComercial;
	}
	public String getColor()
	{
		return this.color;
	}
	
	//setters
	public void setModelo(int mo)
	{
		this.modelo = mo;
	}
	public void setMarca(String ma)
	{
		this.marca = ma;
	}
	public void setValorComercial(double va)
	{
		this.valorComercial = va;
	}
	public void setColor(String co)
	{
		this.color = co;
	}
	
	//Metodo para cantidad de vehiculos
	public int cantidadVehiculos(Vehiculo carro)
	{
		if(carro != null)
		{
			cantidad = cantidad + 1;
		}
		return cantidad;
	}
}
