package sutd;

import java.util.Scanner;

import static sutd.Description.*;
import static sutd.Question.*;

public class Changer {

    static Scanner scanner;
    static final String YES = "да";
    static final String NO = "нет";

    public static void main(String[] args) {
        scanner = new Scanner(System.in, "UTF-8");
        isOneLevelSecrecy();
    }

    static void isOneLevelSecrecy() {
        System.out.println(Q_ONE.getValue());
        String answer = scanner.nextLine().trim();
        if (answer.equals(YES))
            isSameAccessRights();
        else if (answer.equals(NO))
            isExistGovernmentSecret();
        else
            isExistGovernmentSecret();
    }

    static void isExistGovernmentSecret() {
        System.out.println(Q_ONE_ONE.getValue());
        String answer = scanner.nextLine().trim();
        if (answer.equals(YES))
            System.out.println(D_ONE_ONE_ONE.getValue());
        else if (answer.equals(NO))
            System.out.println(D_ONE_ONE_TWO.getValue());
    }

    static void isSameAccessRights() {
        System.out.println(Q_TWO.getValue());
        String answer = scanner.nextLine().trim();
        if (answer.equals(YES))
            isExistInformationWithGriff();
        else if (answer.equals(NO))
            isExistGovernmentSecret_V2();
        else
            isExistGovernmentSecret_V2();
    }

    static void isExistGovernmentSecret_V2() {
        System.out.println(Q_TWO_ONE.getValue());
        String answer = scanner.nextLine().trim();
        if (answer.equals(YES))
            System.out.println(D_TWO_ONE_ONE.getValue());
        else if (answer.equals(NO))
            System.out.println(D_TWO_ONE_TWO.getValue());
    }

    static void isExistInformationWithGriff() {
        System.out.println(Q_THREE.getValue());
        String answer = scanner.nextLine().trim();
        if (answer.equals(YES))
            System.out.println(D_THREE_ONE.getValue());
        else if (answer.equals(NO))
            isExistInfoWithGriffSuperSecret();
        else
            isExistInfoWithGriffSuperSecret();
    }

    static void isExistInfoWithGriffSuperSecret() {
        System.out.println(Q_THREE_TWO.getValue());
        String answer = scanner.nextLine().trim();
        if (answer.equals(YES))
            System.out.println(D_THREE_THREE.getValue());
        else if (answer.equals(NO))
            isExistInfoWithGriffSpecialSecret();
        else
            isExistInfoWithGriffSpecialSecret();
    }

    static void isExistInfoWithGriffSpecialSecret() {
        System.out.println(Q_THREE_FOUR.getValue());
        String answer = scanner.nextLine().trim();
        if (answer.equals(YES))
            System.out.println(D_THREE_FIVE.getValue());
        else if (answer.equals(NO))
            isExistInfoOfficialSecret();
        else
            isExistInfoOfficialSecret();
    }

    static void isExistInfoOfficialSecret() {
        System.out.println(Q_THREE_SIX.getValue());
        String answer = scanner.nextLine().trim();
        if (answer.equals(YES))
            System.out.println(D_THREE_SEVEN.getValue());
        else if (answer.equals(NO))
            System.out.println(D_THREE_EIGHT.getValue());
    }
}
