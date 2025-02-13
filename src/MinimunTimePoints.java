import java.util.LinkedList;

public class MinimunTimePoints {
    public int minTimeToVisitAllPoints(int[][] points) {

        int currentX = points[0][0];
        int currentY = points[0][1];

        int nextX;
        int nextY;


        int seconds = 0;

        for (int i = 1; i < points.length; i++) {
            //logica para o primeiro valor da coord
             nextX = points[i][0];
             nextY = points[i][1];

            seconds += Math.max(Math.abs(currentX - nextX), Math.abs(currentY - nextY));

            currentX = nextX;
            currentY = nextY;


        }
        System.out.println( seconds);
        return seconds;
    }
}
