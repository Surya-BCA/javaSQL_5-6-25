package day4;
class SbiAc{
	private String Accholder;
	private int Balance;
	SbiAc(String Accholder,int Balance){
		this.Accholder=Accholder;
		this.Balance=Balance;
	}
	public String getAccholder() {
		return Accholder;
	}
	public int getBalance(){
		return Balance;
		}
	public void deposit(int dep) {
		if(Balance > 0) {
			Balance += dep;
			System.out.println("Deposit Amount:"+dep);
			System.out.println("Now Current Balance:"+Balance);
		}
		}
		public void setWithdraw(int wd) {
			
				Balance -= wd;
				System.out.println("Withdrawn Amt:"+wd);
				
			}	
	
	public void setAccholder(String Accholder) {
		this.Accholder=Accholder;
	}
}
public class BankDetails {
	public static void main(String[] args) {
		SbiAc ac = new SbiAc("abd",500000);
		System.out.println("Account holder Name:"+ac.getAccholder());
		ac.setAccholder("Waheed");
		System.out.println("Updated Account holder Name:"+ac.getAccholder());
		System.out.println("Curent Balance:"+ac.getBalance());
		ac.deposit(1000);
		ac.setWithdraw(1000);
		System.out.println("Avail Amount:"+ac.getBalance());
		
	}
}
