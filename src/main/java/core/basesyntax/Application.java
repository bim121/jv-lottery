package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[]{
                Lottery.getRandomBall(),
                Lottery.getRandomBall(),
                Lottery.getRandomBall()
        };
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
