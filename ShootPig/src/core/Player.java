package core;

public class Player {
    private String playerName;
    private double BestScore;
    private double CurrentScore;
    private String SpaceShip;

    public Player(){

    }
    public Player(String playerName,  double BestScore,double CurrentScore,String SpaceShip){
        this.playerName =playerName;
        this.BestScore=BestScore;
        this.CurrentScore =CurrentScore;
        this.SpaceShip = SpaceShip;
    }

    public double getBestScore() {
        return BestScore;
    }

    public double getCurrentScore() {
        return CurrentScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getSpaceShip() {
        return SpaceShip;
    }

    public void setBestScore(double bestScore) {
        BestScore = bestScore;
    }

    public void setCurrentScore(double currentScore) {
        CurrentScore = currentScore;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setSpaceShip(String spaceShip) {
        SpaceShip = spaceShip;
    }
}
