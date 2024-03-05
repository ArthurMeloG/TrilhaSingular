package Composicao.Exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class StartComposicao {

    // Um funcionário pode participar de 1 departamento
    public static void start() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departments´s name: ");
        Departament departament = new Departament(scanner.nextLine());

        System.out.println("Enter worker data: ");

        System.out.print("name: ");
        String nameWorker = scanner.nextLine();

        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(scanner.nextLine());

        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(nameWorker, level, baseSalary, departament);

        System.out.print("How many contracts to this worker ?");
        int amountContracts = scanner.nextInt();

        for (int i = 1; i <= amountContracts; i++) {
            System.out.println("Enter contract #" + i + " data: ");

            System.out.print("Date (DD/MM/YYYY: ");
            Date date;
            String s = scanner.next();

            try {
                date = dateFormat.parse(s);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            System.out.print("Value per hour: ");
            double value = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();

            HourContract hc = new HourContract(date, value, hours);
            worker.addContract(hc);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println(worker.income(year, month));


    }
}
