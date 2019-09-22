public class Tabuada{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 0;i <= 9;i++){
			for(int j = 1;j <= i;j++){
				sum = i*j;
				System.out.print(j +"*" + i + "="+ sum + "  ");
			}	
			System.out.println(" ");
		}				
	}
}