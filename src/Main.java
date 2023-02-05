import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham); // Beckham used to test

        Team<FootballPlayer> melbourne= new Team("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccer = new Team<>("Man Chester");
        soccer.addPlayer(beckham);

        Team<FootballPlayer> hawthorn= new Team("Hawthorn");
        Team<FootballPlayer> fremantle= new Team("Fremantle");

        hawthorn.matchResult( fremantle, 1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);
        adelaideCrows.matchResult(baseballTeam,1,1);

        System.out.println( adelaideCrows.numPlayers() );
    }
}
