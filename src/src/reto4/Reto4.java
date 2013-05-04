package src.reto4;

public class Reto4 {
	
	/*	K-->Numero de Kartings
		R-->Numero de vueltas
		S-->Conjunto con los grupos formados por las personas	
	*/
	public void solve(Carrera car)
	{
		
		EstrategiaLlenado est=null;
		if(car.totalParticipantes()<=car.K)
		{
			est=new EstrategiaSobrada();
		}
		else
		{
			est=new EstrategiaJusta();
		}
		
		
		for(int i=0;i<car.R;i++)
		{
			est.llenarVuelta(car);
		}
		
		System.out.println("Cantidad de gasolina "+car.cantidadGasolina);
		
	}

	public static void launch()
	{
		System.out.println("--------------LANZANDO RETO 4");
		
		
		Reto4 r4=new Reto4();
		Carrera car=new Carrera(6, 3, new int[]{1,2,4,3,1});
		Carrera car1=new Carrera(10, 100, new int[]{1});
		Carrera car2=new Carrera(10, 3, new int[]{1,8,1,1});
		Carrera car3=new Carrera(5, 3, new int[]{4,3,2});
		Carrera car4=new Carrera(3, 3, new int[]{1,2,2,2});
		
		r4.solve(car);
		r4.solve(car1);
		r4.solve(car2);
		r4.solve(car3);
		r4.solve(car4);
		
		
		System.out.println("--------------FINALIZANDO RETO 4");
		
	}
}

