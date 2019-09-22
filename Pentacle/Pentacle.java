public class Pentacle{
	public static void main(String[] args){
		for(int i = 1;i <= 5;i++){
			int k = 0;
			while(k <= 5-i){
				System.out.print(" ");
				k++;
			}
			for(int j = 1;j < 2*i-1;j++){
				System.out.print("*");
			}
			System.out.println("*");
		}			
	}
}