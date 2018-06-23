import java.util.ArrayList;

// Team is a class to represent a team in the FIFA world cup rankings
// An ArrayList is created as a collection of that class, and stores the top 20 teams
// Includes the team name, rank, total points, and position increase/decrease from last year
//
// Sorts and prints out the list according to last year's rankings
// Also finds and prints out the most improved and least improved teams
//
// Used data from https://www.fifa.com/fifa-world-ranking/ranking-table/men/index.html

public class WorldCupList {

	public static void main (String[] args) {
		
		ArrayList<Team> teams = new ArrayList<>();
		teams.add(new Team("Belgium", 3, 1298, 0));
		teams.add(new Team("Portugal", 4, 1274, 0));
		teams.add(new Team("Brazil", 2, 1431, 0));
		teams.add(new Team("Switzerland", 6, 1199, 0));
		teams.add(new Team("France", 7, 1198, 0));
		teams.add(new Team("Poland", 8, 1183, 2));
		teams.add(new Team("England", 12, 1051, 1));
		teams.add(new Team("Argentina", 5, 1241, 0));
		teams.add(new Team("Uruguay", 14, 1018, 1));
		teams.add(new Team("Mexico", 15, 989, 0));
		teams.add(new Team("Columbia", 16, 986, 0));
		teams.add(new Team("Netherlands", 17, 981, 2));
		teams.add(new Team("Wales", 18, 953, 3));
		teams.add(new Team("Italy", 19, 951, 1));
		teams.add(new Team("Croatia", 20, 945, -2));
		teams.add(new Team("Germany", 1, 1558, 0));
		teams.add(new Team("Chile", 9, 1135, 0));
		teams.add(new Team("Spain", 10, 1126, -2));
		teams.add(new Team("Peru", 11, 1025, 0));
		teams.add(new Team("Denmark", 12, 1051, 0));
		
		teams.sort((t1, t2) ->
			{
				if (t1.rank + t1.positionChange > t2.rank + t2.positionChange)
					return 1;
				if (t1.rank + t1.positionChange < t2.rank + t2.positionChange)
					return -1;
				return 0;
			});

		for (int i = 0; i < teams.size(); i++)
			System.out.println(teams.get(i));
		
		System.out.println();

	/* You could sort for the Best and Least improved this way, but, this is not the most efficient algorithm.
	 * Plus it changes the list
	 * 
	 
		// sort by position change
		teams.sort((t1, t2) ->
		{
			if (t1.positionChange > t2.positionChange)
				return 1;
			if (t1.positionChange < t2.positionChange)
				return -1;
			return 0;
		});

		// print best improved team
		System.out.println("Best improved: " + teams.get(teams.size()-1));
		// print least improved team
		System.out.println("Least improved: " + teams.get(0));
		
	*/
		
		int mostImprovedValue = 0;
		int mostImprovedIndex = 0;
		for (int i = 0; i < teams.size(); i++)
			if (teams.get(i).positionChange > mostImprovedValue) {
				mostImprovedValue = teams.get(i).positionChange;
				mostImprovedIndex = i;
			}
		// print best improved team
		System.out.println("Best improved: " + teams.get(mostImprovedIndex));
		
		
		int leastImprovedValue = 0;
		int leastImprovedIndex = 0;
		for (int i = 0; i < teams.size(); i++)
			if (teams.get(i).positionChange < leastImprovedValue) {
				leastImprovedValue = teams.get(i).positionChange;
				leastImprovedIndex = i;
			}
		// print least improved team
		System.out.println("Least improved: " + teams.get(leastImprovedIndex));
		
	}
}
