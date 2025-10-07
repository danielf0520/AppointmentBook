//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
boolean[][] schedule =  new boolean[8][60];
AppointmentBook a = new AppointmentBook(schedule);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        a.printPeriod(2);
        a.findFreeBlock(2,15);
        AppointmentBook b = new AppointmentBook(schedule);
        int period = 2;
        while (period < 5)
        {
            System.out.println("period: " + period);
            b.printPeriod(period);
            period++;
        }
        b.printPeriod(4);
        System.out.println(b.makeAppointment(2, 4, 22));
        b.printPeriod(4);
    }

}