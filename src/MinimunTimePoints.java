import java.util.LinkedList;

public class MinimunTimePoints {
    public int minTimeToVisitAllPoints(int[][] points) {

        int startingPointx = points[0][0];
        int startingPointy = points[0][1];

        int nextX;
        int nextY;


        int seconds = 0;

        for (int i = points.length - 1; i >= 0; i--) {
            //logica para o primeiro valor da coord
            int currentX = points[i][0];
            int currentY = points[i][1];

            System.out.println("Inicio x" + currentX);
            System.out.println("Inicio y" + currentY);


            if (i != 0) {
                nextX = points[i - 1][0];
                nextY = points[i - 1][1];
            } else {
                nextX = points[0][0];
                nextY = points[0][1];
            }


            while (currentX != nextX || currentY != nextY) { // Aqui está a correção

                if (currentX < nextX) currentX++;
                if (currentX > nextX) currentX--;
                if (currentY < nextY) currentY++;
                if (currentY > nextY) currentY--;

                seconds++;
            }


        }
        System.out.println( seconds);
        return seconds;
    }
}
