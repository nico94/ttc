
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <http://www.gnu.org/licenses/>


public class Spieler {

	
	private int siege;
	private int niederlagen;
	private int punkte;
	private String name;
	private boolean disqualification;
	
	

	// Spielerkonstruktor	
	  public Spieler(int siege, int niederlagen, int punkte, String name, boolean disqualification)
	 
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

