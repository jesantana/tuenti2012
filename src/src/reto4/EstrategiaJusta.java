package src.reto4;

public class EstrategiaJusta extends EstrategiaLlenado {
	
	@Override
	void llenarVuelta(Carrera carrera) {
		int subidosEnEstaVuelta=0;
		
		while(subidosEnEstaVuelta+carrera.S[carrera.alQueLeToca]<=carrera.K)
		{
			subidosEnEstaVuelta+=carrera.S[carrera.alQueLeToca];
			carrera.cantidadGasolina+=carrera.S[carrera.alQueLeToca];
			carrera.alQueLeToca=(carrera.alQueLeToca+1)%carrera.S.length;
		}
		
	}
}
