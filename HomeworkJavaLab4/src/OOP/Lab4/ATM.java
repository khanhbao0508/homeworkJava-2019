package OOP.Lab4;

public interface ATM {
	public boolean withdraw(int IDinput, double moneyinput);
	public boolean depost(int IDoutput ,double moneyoutput );
	public double queryBalance(int ID);
	public boolean login(String user, String pass);
	public boolean logout(String userout);
}
