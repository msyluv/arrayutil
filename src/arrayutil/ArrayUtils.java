package arrayutil;

public class ArrayUtils {
	
	//1....
	public static double [] intToDouble(int[] src) {
		
		double[] doubleArray=new double[src.length];
		
		for(int i=0;i<doubleArray.length;i++){
			doubleArray[i]=src[i];
		}
		
		return doubleArray;
	}
	//2....
	public static int [] doubleToInt(double[] src){
		
		int[] intArray=new int[src.length];
		
		for(int i=0;i<intArray.length;i++){
			intArray[i]=(int)src[i];
		}
		
		return intArray;
		
	}
	//3....
	public static int [] concat( int[] s1, int[] s2 ){
		
		int[] sumArray=new int[s1.length+s2.length];
		
		for(int i=0;i<s1.length;i++){
			sumArray[i]=s1[i];
		}
		for(int i=0;i<s2.length;i++){
			sumArray[s1.length+i]=s2[i];
		}
		return sumArray;
		
	}


}
