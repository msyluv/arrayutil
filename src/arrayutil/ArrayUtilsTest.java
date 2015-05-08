package arrayutil;

public class ArrayUtilsTest {
	
	
	public static void main(String[] args) {
		int[] intArray={10,20,30,40,50};
		
		//1..
		double[] doubleArray = ArrayUtils.intToDouble(intArray);
		for(int i=0;i<doubleArray.length;i++){
			System.out.println(doubleArray[i]);
		}
		
		//2..
		int[] intArray2=ArrayUtils.doubleToInt(doubleArray);
		for(int i=0;i<intArray2.length;i++){
			System.out.println(intArray2[i]);
		}
		System.out.println();
		
		//3..
		int[] sumArray=ArrayUtils.concat(intArray, intArray2);
		for(int i=0;i<sumArray.length;i++){
			System.out.println(sumArray[i]);
		}
	}
}
