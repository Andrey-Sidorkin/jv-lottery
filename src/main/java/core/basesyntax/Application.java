package core.basesyntax;

public class Application {

    private static int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
