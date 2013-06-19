//==============================================================================
//        * Letsch Informatik *       www.LetsInfo.ch       CH-8636 Wald
//          Beratung, Ausbildung und Realisation in Software-Engineering
//==============================================================================
// Project   : Master of Advanced Studies in Software-Engineering 2013
// Modul     : OO-Einführung mit UML und Java
//             Teil: UML -> Java
// Title     : Übung 4: Assoziation: Klassen Person und Autos
// Author    : Thomas Letsch 
// Tab-Width : 2
/*///===========================================================================
* Description: Klassen Person mit Klasse Auto mittels Array.
CVS:$Revision: 1.15 $  $Date: 2013/04/22 16:13:24 $
/*///===========================================================================
//       1         2         3         4         5         6         7         8
//345678901234567890123456789012345678901234567890123456789012345678901234567890
//==============================================================================




// Test-Applikation:

public class PersonAutosTest {
  
  public static void main(String[] args) {
    
    Person pers = new Person();
    System.out.println("\naddAuto()'s:");
    Auto wagen1 = new Auto("VW", "AG12");
    System.out.println("pers.addAuto(wagen1) = " + pers.addAuto(wagen1));
    Auto wagen2 = new Auto("Porsche", "ZH5");
    System.out.println("pers.addAuto(wagen2) = " + pers.addAuto(wagen2));
    System.out.println("\nprintAutos():");
    pers.printAutos();
    System.out.println("\naddAuto()'s:");
    Auto wagen3 = new Auto("BMW", "AG3");
    System.out.println("pers.addAuto(wagen3) = " + pers.addAuto(wagen3));
    Auto wagen4 = new Auto("Suzuki", "AG4");
    System.out.println("pers.addAuto(wagen4) = " + pers.addAuto(wagen4));
    Auto wagen5 = new Auto("Maserati", "AG5");
    System.out.println("pers.addAuto(wagen5) = " + pers.addAuto(wagen5));
    Auto wagen6 = new Auto("Marke6", "Kennzeichen6");
    System.out.println("pers.addAuto(wagen6) = " + pers.addAuto(wagen6));
    System.out.println("\nprintAutos():");
    pers.printAutos();
    
  }
  
}


/* Session-Log:

addAuto()'s:
pers.addAuto(wagen1) = true
pers.addAuto(wagen2) = true

printAutos():
Auto Nr. 1: 
  Marke       : Marke1
  Kennzeichen : Kennzeichen1
Auto Nr. 2: 
  Marke       : Marke2
  Kennzeichen : Kennzeichen2
Auto Nr. 3: null
Auto Nr. 4: null
Auto Nr. 5: null

addAuto()'s:
pers.addAuto(wagen3) = true
pers.addAuto(wagen4) = true
pers.addAuto(wagen5) = true
pers.addAuto(wagen6) = false

printAutos():
Auto Nr. 1: 
  Marke       : Marke1
  Kennzeichen : Kennzeichen1
Auto Nr. 2: 
  Marke       : Marke2
  Kennzeichen : Kennzeichen2
Auto Nr. 3: 
  Marke       : Marke3
  Kennzeichen : Kennzeichen3
Auto Nr. 4: 
  Marke       : Marke4
  Kennzeichen : Kennzeichen4
Auto Nr. 5: 
  Marke       : Marke5
  Kennzeichen : Kennzeichen5

*/
