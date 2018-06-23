// Team is a class to represent a team in the FIFA world cup rankings
// An ArrayList is created as a collection of that class, and stores the top 20 teams
// Includes the team name, rank, total points, and position increase/decrease from last year
//
// Sorts and prints out the list according to last year's rankings
// Also finds and prints out the most improved and least improved teams

public class Team {
	
	public String name;
	public int rank;
	public int totalPoints;
	public int positionChange;
	
	public Team(String name, int rank,
			int totalPoints, int positionChange) {
		
		this.name = name;
		this.rank = rank;
		this.totalPoints = totalPoints;
		this.positionChange = positionChange;
	}
	
	@Override
	public String toString() {
		return name + " (" + rank + " previously " + 
				(rank + positionChange) + ")";
	}
}
