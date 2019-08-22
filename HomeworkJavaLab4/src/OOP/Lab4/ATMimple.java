package OOP.Lab4;

public class ATMimple implements ATM {
	private int idATM;
	private int accountID;
	
	public ATMimple(int idATM, int accountID) {
		super();
		this.idATM = idATM;
		this.accountID = accountID;
	}

	public int getIdATM() {
		return idATM;
	}

	public void setIdATM(int idATM) {
		this.idATM = idATM;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	@Override
	public boolean withdraw(int IDinput, double moneyinput) {
		// TODO Auto-generated method stub
		this.accountID=IDinput;
		if(IDinput == 1997)
		{
			System.out.println("Rút tuền"+moneyinput+" thành công");
			return true;
		}
		System.out.println("Rút tiền thất bại");
		return false;
		
	}

	@Override
	public boolean depost(int IDoutput, double moneyoutput) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double queryBalance(int ID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(String user, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(String userout) {
		// TODO Auto-generated method stub
		return false;
	}

}
