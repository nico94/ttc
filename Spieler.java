
public class Spieler {

	
	private int siege;
	private int niederlagen;
	private int punkte;
	private String name;
	private bool disqualification;
	
	

	// Spielerkonstruktor	
	  public Spieler(int siege, int niederlagen, int punkte, String name, bool disqualification)
	  {
		  this.setSiege(siege);
		  this.niederlagen = niederlagen;
		  this.punkte = punkte;
		  this.name = name;
		  this.disqualification = disqualification;
		  
	  }

	  //	  Setter & Getter 
	public int getSiege() {
		return siege;
	}


	public void setSiege(int siege) {
		this.siege = siege;
	}
}

