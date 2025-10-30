
//public class Main {
//    public static void main(String[] args) {
//        boolean[][] scheduleA = new boolean[8][60];
//        boolean[][] scheduleB = new boolean[8][60];
//        AppointmentBook a = new AppointmentBook(scheduleA);
//        for (int i = 10; i < 15; i++) scheduleA[1][i] = true;
//        for (int i = 30; i < 45; i++) scheduleA[1][i] = true;
//        for (int i = 50; i < 60; i++) scheduleA[1][i] = true;
//        System.out.println(a.findFreeBlock(2, 15)); //returns 30
//        System.out.println(a.findFreeBlock(2,9));  //returns 30
//        System.out.println(a.findFreeBlock(2,20));  //returns -1
//        AppointmentBook b = new AppointmentBook(scheduleB);
//        for (int i = 25; i < 30; i++) scheduleB[1][i] = true;
//        for (int i = 0; i < 15; i++) scheduleB[2][i] = true;
//        for (int i = 41; i < 60; i++) scheduleB[2][i] = true;
//        for (int i = 5; i < 30; i++) scheduleB[3][i] = true;
//        for (int i = 44; i < 60; i++) scheduleB[3][i] = true;
//        System.out.println(b.makeAppointment(2,4,22)); //returns true
//        System.out.println(b.makeAppointment(3,4,3));  //returns true
//        System.out.println(b.makeAppointment(2,4,30)); //returns false
//        for (int i = 2; i < 5; i++) {
//            System.out.println("Period: " + i);
//            b.printPeriod(i);
//        }
//
//
//    }
//}

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(reader());
    }

    public static int reader() throws FileNotFoundException {
        int fulfilled = 0;

        File f = new File("schedules.txt");
        Scanner s = new Scanner(f);

        for (int x = 0; x < 1000 && s.hasNextBoolean(); x++) {
            boolean[][] schedule = new boolean[8][60];

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 60; j++) {
                    schedule[i][j] = s.nextBoolean();
                }
            }

            AppointmentBook book = new AppointmentBook(schedule);

            int startPeriod = s.nextInt();
            int endPeriod = s.nextInt();
            int duration = s.nextInt();

            if (book.makeAppointment(startPeriod, endPeriod, duration)) {
                fulfilled++;
            }

        }
        s.close();
        return fulfilled;
    }
}

