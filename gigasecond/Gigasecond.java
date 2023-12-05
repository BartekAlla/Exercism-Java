import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Gigasecond {
    private LocalDateTime dateTime;

    public static final long GIGASECONDS = 1_000_000_000;

    public Gigasecond(LocalDate moment) {
        this.dateTime = moment.atTime(0, 0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime.plusSeconds(GIGASECONDS);
    }
}
