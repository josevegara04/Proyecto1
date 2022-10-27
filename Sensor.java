package proyecto1;

public class Sensor 
{
	//atributos
	private String tipo;
	private double valor;
	public String infoSensores;
	private int cantidadSen =0; 
	
	//Constructor vacio
	public Sensor()
	{
		
	}
	
	//Constructor de dos parametros
	public Sensor(String t, double v)
	{
		this.tipo = t;
		this.valor = v;
	}
	
	//Metodo toString
	public String toStringSensores()
	{
		infoSensores = this.tipo + ", " + this.valor;
		return infoSensores;
	}
	
	//Metodo para cantidad de sensores
	public int cantidadSensores(Sensor sen)
	{
		if(sen != null)
		{
			cantidadSen = cantidadSen + 1;
		}
		return cantidadSen;
	}
	
	//setters
	public void setTipo(String t)
	{
		this.tipo = t;
	}
	public void setValor(double v)
	{
		this.valor = v;
	}
	
	//getters 
	public String getTipo()
	{
		return this.tipo;
	}
	public double getValor()
	{
		return this.valor;
	}
}
