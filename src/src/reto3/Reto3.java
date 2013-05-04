package src.reto3;

public class Reto3 {
	
	public void solve(Stock[] acc)
	{
	    Stock maxD=new Stock(Integer.MIN_VALUE,-1);
	    Stock minD=new Stock(Integer.MAX_VALUE,-1);
	    Stock min=new Stock(Integer.MAX_VALUE,-1);

	    for(int i=0;i<acc.length;i++)
	    {
	      if(menorQueMinimo(acc,i,min)){
	    	  min=acc[i];
	      }
	      else if(acc[i].cantidad-min.cantidad>maxD.cantidad-minD.cantidad)
	      {
	    	  maxD=acc[i];
	    	  minD=min;
	      }
	    }
	    
	    if(minD.tiempo==-1)
	    {
	      System.out.println("Es mejor no comprar");  
	    }
	    else{
	      System.out.println("El mejor es comprar en Cantidad: "+minD.cantidad+" momento "+minD.tiempo+" y vender en Cantidad: "+maxD.cantidad+" momento "+maxD.tiempo);  
	    }
	 }
	  
	  private static boolean menorQueMinimo(Stock[] acc,int p1,Stock min)
	  {
	    return min.cantidad>acc[p1].cantidad;
	  }
	  
	  
	  public static void launch()
		{
			System.out.println("--------------LANZANDO RETO 3");
			
			
			Reto3 r3=new Reto3();
			Stock[] s1=new Stock[]{new Stock(70,0),new Stock(93,100),new Stock(69,200),new Stock(75,300),new Stock(52,400),
					new Stock(73,500),new Stock(67,600),new Stock(81,700),new Stock(65,800),new Stock(48,900),new Stock(67,1000)};
			
			Stock[] s2=new Stock[]{new Stock(1100,0),new Stock(1000,100),new Stock(900,200),new Stock(800,300),new Stock(700,400),
					new Stock(600,500),new Stock(500,600),new Stock(400,700),new Stock(300,800),new Stock(200,900),new Stock(100,1000)};
			
			Stock[] s3=new Stock[]{new Stock(100,0),new Stock(200,100),new Stock(300,200),new Stock(400,300),new Stock(500,400),
					new Stock(600,500),new Stock(700,600),new Stock(800,700),new Stock(900,800),new Stock(1000,900),new Stock(1100,1000)};
			
			Stock[] s4=new Stock[]{new Stock(5,0),new Stock(7,100),new Stock(3,200),new Stock(7,300),new Stock(2,400),
					new Stock(6,500),new Stock(1,600),new Stock(4,700)};
			
			r3.solve(s1);
			r3.solve(s2);
			r3.solve(s3);
			r3.solve(s4);
			
			
			System.out.println("--------------FINALIZANDO RETO 3");
			
		}
	  
}
