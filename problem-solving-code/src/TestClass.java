import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class Pair {
    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class TestClass {
    static int minParkingSpaces(int[][] parkingStartEndTimes) {
        int i, j, max = 0;
        int n = parkingStartEndTimes.length;
        int mcl[] = new int[n];
        List<Pair> arr = new ArrayList<>();
        /* Initialize MCL (max chain length) values for all indexes */
        for (i = 0; i < n; i++)
            mcl[i] = 1;
        for (int k = 0; k < n; k++) {
            arr.add(new Pair(parkingStartEndTimes[k][0], parkingStartEndTimes[k][1]));
        }
        /* Compute optimized chain length values in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr.get(i).a > arr.get(j).b && mcl[i] < mcl[j] + 1)
                    mcl[i] = mcl[j] + 1;

        // mcl[i] now stores the maximum chain length ending with pair i

        /* Pick maximum of all MCL values */
        for (i = 0; i < n; i++)
            if (max < mcl[i])
                max = mcl[i];

        return max;
    }

    // DO NOT MODIFY ANYTHING BELOW THIS LINE!!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int[][] parkingStartEndTimeList = new int[n][2];
        String[] parkingStartEndTimes = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
            for (int j = 0; j < parkingStartEndTime.length; j++) {
                parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
            }
        }

        int out = minParkingSpaces(parkingStartEndTimeList);
        System.out.println(out);

        wr.close();
        br.close();
    }
}