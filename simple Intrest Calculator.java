public class simple Intrest Calculator{
	public static void calculateSimpleIntrest(double principle,double rate,double time){
        System.out.print("simple Intrest: ");
        System.out.println(principle*rate*time/100);
    }
    public static void main(String[] args){
        calculateSimpleIntrest(1000.0,5.0,2.0);
    }
}
       	