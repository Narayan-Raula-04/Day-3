import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIExample {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate joiningDate = LocalDate.of(2025, 1, 10);
        LocalTime loginTime = LocalTime.of(10, 0);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDate probationEnd = joiningDate.plusMonths(6);
        LocalTime logoutTime = loginTime.plusHours(9);

        System.out.println("Today's Date       : " + today);
        System.out.println("Current Time       : " + nowTime);
        System.out.println("Current DateTime   : " + nowDateTime.format(formatter));
        System.out.println("Joining Date       : " + joiningDate);
        System.out.println("Login Time         : " + loginTime);
        System.out.println("Probation End Date : " + probationEnd);
        System.out.println("Logout Time        : " + logoutTime);
    }
}
