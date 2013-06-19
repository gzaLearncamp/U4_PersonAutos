public class Auto {

	//TESTING Editing on git
	/**
	 * @param args
	 */
	private String mMarke;
	private String mKennzeichen;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Konstruktor
	public Auto(String pMarke, String pKennzeichen)
	{
		setMarke(pMarke);
		setKennzeichen(pKennzeichen);
	}
	
	public void setMarke(String pMarke)
	{
		mMarke=pMarke;
	}
	
	public String getMarke()
	{
		return mMarke;
	}
	
	public void setKennzeichen(String pKennzeichen)
	{
		mKennzeichen=pKennzeichen;
	}
	
	public String getKennzeichen()
	{
		return mKennzeichen;
	}
	
	

}
