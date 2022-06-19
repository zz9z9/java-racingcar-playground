package racing.view;

import racing.domain.Car;

import java.util.Comparator;
import java.util.List;

public class ResultView {

    public static void displayCurrentPosition(List<Car> cars) {
        for(Car car : cars) {
            System.out.println(String.format("%s : %s", car.getName(), getPositionState(car)));
        }
    }

    public static void displayWinners(List<Car> cars) {
        cars.stream().sorted(Comparator.comparingInt(Car::getPosition).reversed());

        StringBuilder sb = new StringBuilder();
        int MAX = cars.get(0).getPosition();

        for(Car car : cars) {
            if(car.getPosition() == MAX) {
                sb.append(car.getName()+" ");
            }
        }

        System.out.println(sb.toString()+"가 최종 우승헀습니다.");
    }

    private static String getPositionState(Car car) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<car.getPosition(); i++) {
            sb.append("-");
        }

        return sb.toString();
    }
}
