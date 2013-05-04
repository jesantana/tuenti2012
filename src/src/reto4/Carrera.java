package src.reto4;

public class Carrera {
	
	public int K;
	public int R;
	public int[] S;
	
	public int alQueLeToca;
	
	int cantidadGasolina=0;
	
	
	public Carrera(int K,int R, int[] S)
	{
		this.K=K;
		this.R=R;
		this.S=S;
		
		alQueLeToca=0;
		cantidadGasolina=0;
	}
	
	public int totalParticipantes()
	{
		int total=0;
		for(int i=0;i<S.length;i++)
		{
			total+=S[i];
		}
		
		return total;
	}

}
