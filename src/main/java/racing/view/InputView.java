package racing.view;

import java.util.Scanner;

public class InputView {

   private static Scanner sc = new Scanner(System.in);

    public static String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        String carNames = sc.nextLine();
        return carNames.split(",");
    }

    public static int getTrialCount() {
        System.out.println("시도할 횟수는 몇 회 인가요?");

        int trialCount = sc.nextInt();
        return trialCount;
    }
}
