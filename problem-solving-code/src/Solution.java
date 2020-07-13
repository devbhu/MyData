import java.util.*;

class Player{
    String name;
    Integer innings;
    Integer runs;

    public Player(String name, Integer innings, Integer runs) {
        this.name = name;
        this.innings = innings;
        this.runs = runs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInnings() {
        return innings;
    }

    public void setInnings(Integer innings) {
        this.innings = innings;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }
}
public class Solution {
    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
       Map<String, Player> map= new HashMap<>();
        @Override
        public void putNewInnings(String player, int runs){
            if (map.containsKey(player)) {

                Player player1= map.get(player);
                player1.setInnings(player1.getInnings()+1);
                player1.setRuns(player1.getRuns()+runs);
                map.put(player,player1);
            }
            else
            map.put(player,new Player(player,1,runs));
        }

        @Override
        public double getAverageRuns(String player){
            Player player1= map.get(player);
            return Double.valueOf(player1.getRuns())/player1.getInnings();
        }

        @Override
        public int getInningsCount(String player){
            return map.get(player).getInnings();
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
