package Lesson_12.football;

public class Team {
    private Integer score;
    private Integer goals;
    private Integer games;

    public Team() {
    }

    public Team(Integer score, Integer goals, Integer games) {
        this.score = score;
        this.goals = goals;
        this.games = games;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }
}
