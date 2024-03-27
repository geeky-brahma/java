package l6;

import java.util.Scanner;

class HrsException extends Exception {
    HrsException(String s) {
        super(s);
    }
}

class MinException extends Exception {
    MinException(String s) {
        super(s);
    }
}

class SecException extends Exception {
    SecException(String s) {
        super(s);
    }
}

class Time {
    int hours, minutes, seconds;

    public void getTime() throws HrsException, MinException, SecException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours: ");
        hours = scanner.nextInt();
        if (hours > 24 || hours < 0) {
            throw new HrsException("InvalidHourException: hour is not in the range 0-24");
        }

        System.out.println("Enter minutes: ");
        minutes = scanner.nextInt();
        if (minutes > 60 || minutes < 0) {
            throw new MinException("InvalidMinuteException: minute is not in the range 0-60");
        }

        System.out.println("Enter seconds: ");
        seconds = scanner.nextInt();
        if (seconds > 60 || seconds < 0) {
            throw new SecException("InvalidSecondException: second is not in the range 0-60");
        }
    }
}

public class Clock {
    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.getTime();
            System.out.println("Correct Time-> " + time.hours + ":" + time.minutes + ":" + time.seconds);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

