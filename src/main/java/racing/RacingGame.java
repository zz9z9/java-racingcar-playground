package racing;

import racing.domain.Car;
import racing.util.NumberGenerator;
import racing.view.InputView;
import racing.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    public static void main(String[] args) {
        String[] carNames = InputView.getCarNames();
        int trialCnt = InputView.getTrialCount();

        List<Car> cars = new ArrayList<>();
        for(String name : carNames) {
            cars.add(new Car(name));
        }

        System.out.println("실행 결과");

        while(trialCnt-- > 0) {
            for(Car car : cars) {
                int num = NumberGenerator.getRandomNum();
                car.move(num);
            }

            ResultView.displayCurrentPosition(cars);
            System.out.println();
        }

        ResultView.displayWinners(cars);
    }
}
