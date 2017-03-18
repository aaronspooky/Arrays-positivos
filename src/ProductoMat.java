import java.io.*;
public class ProductoMat {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		double v[];
		int n;
		System.out.println("Numero de elementos: ");
		System.out.flush();
		n = Integer.parseInt(entrada.readLine());
		v = new double[n];
		leerArray(v);
		System.out.println("El producto de los elementos= " +producto(v));
		System.out.println("El maximo de los elementos= " +maximo(v));
	}
	
	static void leerArray(double a[]) throws IOException{
		int n = 0;
		System.out.println("Introduzca " +a.length + "datos.");
		for(; n<a.length; n++){
			a[n] = (Double.valueOf(entrada.readLine())).doubleValue();
		};
	}
	
	static double producto(double w[]){
		double pd = 1.0;
		int n = w.length-1;
		while(n > 0){
			if(w[n]>0.0){
				pd *= w[n--];
			} else {
				n--;
			}
			
		}
		return pd;
	}
	
	static double maximo(double a[]){
		double mx;
		int i;
		mx = a[0];
		for(i=1; i<a.length; i++){
			mx = (a[i]>mx ? a[i] : mx);
		}
		return mx;
	}

}
