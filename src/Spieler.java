
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

	
	private int siege = 0;
	private int niederlagen = 0;
	private int punkte = 0;
	private String name;
	private boolean disqualification;
	
	

	// Spielerkonstruktor	
	  public Spieler(int siege, int niederlagen, int punkte, String name, boolean disqualification)
	 
	  {
		  this.siege = siege;
		  this.niederlagen = niederlagen;
		  this.punkte = punkte;
		  this.name = name;
		  this.disqualification = disqualification;
	  }

	  //Abfragen
	  public int punkteabfrage (){
		  return punkte;}
	  public int siegeabfrage () {
		  return siege;}
	  public int niederlagenabfrage () {
		  return niederlagen;}
	  
	  //Methoden
	  public void wins () {
		   siege =+ 1;
		   punkte =+ 3;
	  }
	  public void loose () {
		   niederlagen =+ 1;
		   punkte =- 3;
	  }
	   
	  
	  
	  
}
	  
	  
	  
	  
	  
	  
	 