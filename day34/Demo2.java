 package day34;
 //Encapsulation- keeping Fd and retrieving maturity amount
 class FD
 {
	 private double amount;
	 private final double ROI=0.07;
	 
	 FD(int amount)
	 {
		 this.amount=amount;
	 }
	 
	  void getMaturityAmount()
	 {
		 double maturityAmount=amount+amount*ROI;
		 System.out.println(maturityAmount);
	 }
	 
	 
 }

public class Demo2 {
	public static void main(String[] args) {
		FD f=new FD(100000);
		f.getMaturityAmount();  
		
	}

}
