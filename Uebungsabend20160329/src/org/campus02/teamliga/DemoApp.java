package org.campus02.teamliga;

public class DemoApp {

	public static void main(String[] args) throws TeamNotFoundException, LigaException {
		// TODO Auto-generated method stub
			
		Liga bundesLiga = new Liga("T-Mobile Liga");
		try {
			bundesLiga.add("SK Sturm");
			bundesLiga.add("SK Rapid");
			bundesLiga.add("Wacker Tirol");
			bundesLiga.add("AC Klagenfurt");
		} catch (TeamAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bundesLiga.newGame("SK Rapid", 4, "SK Sturm", 3);
		
		System.out.println("--- aktuelle tabelle");
		System.out.println(bundesLiga.getTeamsByPoints());
		System.out.println("--- alle teams");
		System.out.println(bundesLiga.getAllTeams());
		
	}

}
