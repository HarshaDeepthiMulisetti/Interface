package com_Examples;

public interface Hocky {
	 public void Womenteamplayers();
		public void menteamplayers();
}
interface Football {
	  public void goalscore();
	  public void players();
}
  interface Sports extends Hocky,Football{
	  public void teamScore();               //here interface extends interface
		public void teammembers();
		public void totalsports();
}
  
  
  
  
  
  
  
  