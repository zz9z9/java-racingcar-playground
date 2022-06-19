package racing.domain;

import java.security.InvalidParameterException;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name) {
        if(name!=null && name.length() > 5) {
            throw new InvalidParameterException();
        }

        this.name = name;
    }

    public void move(int num) {
        if(num >=4) {
            this.position+=1;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
