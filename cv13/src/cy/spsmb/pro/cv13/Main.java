package cy.spsmb.pro.cv13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    static DateTimeFormatter PATTERN = DateTimeFormatter.ofPattern("dd.MM.YYYY hh:mm:ss");
    static DateTimeFormatter czechDateFormat = DateTimeFormatter.ofPattern(" MM // MMMM / yyyy EEEE", Locale.getDefault());

    /**
     * Praktická část
     * 1.	Zjistěte kolik uběhlo času od 1.1.2023 do současného dne. (max 2b)
     * 2.	Zjistěte kolik uběhlo času od 17. září 1991 do dne vašeho narození. (max 2b)
     * 3.	Naformátujte datum do formátu ČísloMěsíce//NázevMěsíce – DenSlovně – Rok (max 1b)
     */
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.format(PATTERN));


        // 1.	Zjistěte kolik uběhlo času od 1.1.2023 do současného dne. (max 2b)
        LocalDate first = LocalDate.of(2023, Month.JANUARY,1);
        LocalDate first2 = LocalDate.parse("2023-01-01");
        System.out.println(first.equals(first2));

        Long between = ChronoUnit.DAYS.between(first,now.toLocalDate());
        System.out.println("Počet dní od 1.1.2023 je: " + between);

        // 2.	Zjistěte kolik uběhlo času od 17. září 1991 do dne vašeho narození. (max 2b)
        LocalDate myBirthday = LocalDate.parse("1991-12-11");
        LocalDate secondDate = LocalDate.parse("1991-09-17");
        Long timeFromSecond = ChronoUnit.DAYS.between(secondDate,myBirthday);
        System.out.println("Počet dní od 17. září 1991 je: " + timeFromSecond);

        // 3.   Naformátujte datum do formátu ČísloMěsíce//NázevMěsíce – DenSlovně – Rok (max 1b)

        System.out.println(LocalDate.now().format(czechDateFormat));




    }
}
