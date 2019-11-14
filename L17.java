//Player Class Inheritance

class L17 {

    static class Player{
        String name, address, dob;
    }

    static class CricketPlayer extends Player{
        String id, team, type;
        int totalRuns, totalBoundaries;
    }

    static class FootballPlayer extends Player{
        String id, team;
        int totalPoints;
    }

    static class HockeyPlayer extends Player{
        String id, team;
        int totalPoints;
    }

    public static void main(String args[]){

    }
}