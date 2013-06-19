
public class Person {
	/* wir lernen an der HSR MAS SE 13
@see auch bei HSR
@version 2.0
@author Gianni Zanetti
*/
	// Attribute oder Felder
	private String mName;
	private int mAlter;
	private boolean mSex;
	private Auto[] mAutos; // array
	private final static int MAX_AUTOS=5; // TOP CEILING ANZAHL AUTOS
	private int     mAnzahlAutos; // momentane Anzahl Autos
	
	/**
	 * @author gzanetti
	 * @see http://www.voltar.
	 * @serialData 18 June 2013
	 */
	
	public Person() {
	    mAutos = new Auto[MAX_AUTOS];
	  }
	  
	// setter Methode für Name
	public void setName (String pName){
		mName=pName;
	}
	
	//getter Methode für Name
	public String getName(){
		return mName;
	}
	// setter Methode für Alter
	public void setAlter(int pAlter){
		mAlter=pAlter;
	}
	
	// getter Methode für Alter
	public int getAlter(){
		return mAlter;
	}

	public void setSex(boolean pSex)
	{
		
		mSex=pSex;
		
	}

	public boolean getSex(){
		return mSex;
	}
	
	  /**
	   * Fügt ein neues Auto hinzu.
	   * @param pAuto: das neue Auto
	   * @return true wenn o.k., false wenn kein Platz mehr
	   */
	public boolean addAuto(Auto pAuto) // Volllzug melden, wird als false initialisiert
	{
		if (mAnzahlAutos < MAX_AUTOS)
		{
		      mAutos[mAnzahlAutos] = pAuto;
		      mAnzahlAutos++;
		      return true;
			
		}
		return false; // kein Platz mehr für zusätzliches Auto
	}
	
	
	/**
	 * Autos anzeigen
	 * 
	 */
	public void printAutosForEachDemo()
	{
		for (Auto element : mAutos)
		{
			System.out.println(element);
		}
	}
	
	  public void printAutos() {
		    for (int i = 0; i < MAX_AUTOS; i++) {
		      System.out.print("Auto Nr. " + (i + 1) + ": ");
		      if (mAutos[i] == null) { // kein Auto
		        System.out.println("nix da my friend / null");
		      } 
		      else {
		        System.out.println("");
		        System.out.println("  Marke       : " + mAutos[i].getMarke());
		        System.out.println("  Kennzeichen : " + mAutos[i].getKennzeichen());
		      }
		    }
		  }
}
