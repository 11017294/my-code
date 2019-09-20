public class SayHello{
	public static void main(String[] args){
		System.out.println("Batman can't fly!");
		sayHello(0);
	}
 
	public static void sayHello(int sum){
		System.out.println("Hello World ! " + sum);
		}
 
	public static int sum(){
		int sum = 0;
		for(int i = 0; i <= 10;i++){
			sum += i;
		}
		return sum;
	}
}