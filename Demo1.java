class Demo1 {
	int tenure = 0;
	double principal;
	float interestRate;
	String accountNumber;
	double calculateEMI(){
		return 2000;
	}
}

  class Demo2 extends Demo1{
  
  // Error as  final method is overriding
  double calculateEMI(){
		return 8000;
	}
  
  }	

class FinalDemo{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.tenure = 1;		//Error as tenure is final 
		System.out.println(d.tenure);
		System.out.println(d.calculateEMI());
	}
}