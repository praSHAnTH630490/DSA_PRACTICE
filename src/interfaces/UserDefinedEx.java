package interfaces;
class InsuficientFund extends RuntimeException {

	InsuficientFund(String str){
		super(str);
	}
}
 class UserDefinedEx {
  UserDefinedEx(){
	  System.out.println("User defined Exception class");
  }
  public void checkStatus()  {
	  int diposit = 2999;
	  int withdrow = 3000;
	  if(diposit>withdrow) {
		 System.out.println(diposit - withdrow);
	  }
	  else {
	 
		  throw new InsuficientFund(" thers is no enugh fund ");
	  }
  }
	public static void main(String[] args) throws InsuficientFund {
		UserDefinedEx t = new UserDefinedEx();
		t.checkStatus();

	}

}
