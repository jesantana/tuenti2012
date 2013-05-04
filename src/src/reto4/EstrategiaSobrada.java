package src.reto4;

public class EstrategiaSobrada extends EstrategiaLlenado {
	
		@Override
		void llenarVuelta(Carrera carrera) {
			
			for(int i=0;i<carrera.S.length;i++)
			{
				carrera.cantidadGasolina+=carrera.S[i];
			}
			carrera.alQueLeToca=0;
			
		}
	
}
