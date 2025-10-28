//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean[][] scheduleA = new boolean[8][60];
        boolean[][] scheduleB = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(scheduleA);
        for (int i = 10; i < 15; i++) scheduleA[1][i] = true;
        for (int i = 30; i < 45; i++) scheduleA[1][i] = true;
        for (int i = 50; i < 60; i++) scheduleA[1][i] = true;
        System.out.println(a.findFreeBlock(2, 15));
        System.out.println(a.findFreeBlock(2,9));
        System.out.println(a.findFreeBlock(2,20));
        AppointmentBook b = new AppointmentBook(scheduleB);
        for (int i = 25; i < 30; i++) scheduleB[1][i] = true;
        for (int i = 0; i < 15; i++) scheduleB[2][i] = true;
        for (int i = 41; i < 60; i++) scheduleB[2][i] = true;
        for (int i = 5; i < 30; i++) scheduleB[3][i] = true;
        for (int i = 44; i < 60; i++) scheduleB[3][i] = true;
        System.out.println(b.makeAppointment(2,4,22));
        System.out.println(b.makeAppointment(3,4,3));
        System.out.println(b.makeAppointment(2,4,30));
        for (int i = 2; i < 5; i++) {
            System.out.println("Period: " + i);
            b.printPeriod(i);
        }


    }
}
