package core;

public class Player {

    private double BestScore;
    private double CurrentScore;
    private String SpaceShip ="ShootPig/Asset/template/bigGun.png";

    public Player(){

    }
    public Player( double BestScore,double CurrentScore){

        this.BestScore=BestScore;
        this.CurrentScore =CurrentScore;

    }

    public Player( double BestScore,double CurrentScore,String SpaceShip){

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



    public String getSpaceShip() {
        return SpaceShip;
    }

    public void setBestScore(double bestScore) {
        BestScore = bestScore;
    }

    public void setCurrentScore(double currentScore) {
        CurrentScore = currentScore;
    }



    public void setSpaceShip(String spaceShip) {
        SpaceShip = spaceShip;
    }
}
