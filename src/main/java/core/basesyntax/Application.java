package core.basesyntax;

import core.basesyntax.Lottery;

public class Application {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Ball ball = Lottery.getRandomBall();
            System.out.println("Ball " + i + "= " + ball);
        }
        // create three balls using class Lottery and print information about them in console
    }
}
}
