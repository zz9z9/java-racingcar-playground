package racing.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class CarTest {
    private static Car car;

    @BeforeAll
    public static void init() {
        car = new Car("Test");
    }

    @Test
    @DisplayName("자동차 이름은 5자 이하여야한다.")
    public void checkValidCarName() {
        String name = "Kona";
        Assertions.assertEquals(name, new Car(name).getName());
    }

    @Test
    @DisplayName("자동차 이름이 5자를 초과하면 익셉션 발생.")
    public void checkCarNameLength() {
        Assertions.assertThrows(InvalidParameterException.class, () -> new Car("Sonata"));
    }

    @Test
    @DisplayName("숫자 4이상일 경우에 자동차는 전진한다.")
    public void moveByCondition() {
        int prevPosition = car.getPosition();
        car.move(4);

        Assertions.assertEquals(prevPosition+1, car.getPosition());
    }

    @Test
    @DisplayName("숫자 4보다 작으면 자동차는 전진하지 않는다.")
    public void stopByCondition() {
        int prevPosition = car.getPosition();
        car.move(2);

        Assertions.assertEquals(prevPosition, car.getPosition());
    }
}
