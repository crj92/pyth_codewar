public class Test2 {
	public static void main(String[] args) {
		int arr[] = { 80, 80, 95 };
		double ar1[] = { 0.4, 0.4, 0.2 };
		double sum=0;
		double sw=0;
		for(int i=0;i<arr.length;i++){
			for (int j=0;j<ar1.length;j++){
				System.out.println(i+""+j);
				if (i==j){
				sum=sum+(arr[i]*ar1[j]);
				sw=sw+(ar1[j]);
				}
				else{
					System.out.println("do nothing");
				}
			}
		}
		double res=sum/sw;
		System.out.format(String.format("%.1f", res));
	}
}
