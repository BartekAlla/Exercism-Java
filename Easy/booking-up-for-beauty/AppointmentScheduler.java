import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18);
    }

    public String normalizeMonthName(LocalDateTime appointmentDate) {
        return appointmentDate.getMonth().name().charAt(0)
                + appointmentDate.getMonth().name().substring(1, appointmentDate.getMonth().name().length()).toLowerCase();
    }

    public String normalizeDayOfWeek(LocalDateTime appointmentDate) {
        return appointmentDate.getDayOfWeek().name().charAt(0)
                + appointmentDate.getDayOfWeek().name().substring(1, appointmentDate.getDayOfWeek().name().length()).toLowerCase();
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return String.format("You have an appointment on %s, %s %d, %d, at %d:%s %s.",
                normalizeDayOfWeek(appointmentDate),
                normalizeMonthName(appointmentDate),
                appointmentDate.getDayOfMonth(),
                appointmentDate.getYear(),
                appointmentDate.getHour() > 12 ? appointmentDate.getHour() % 12 : appointmentDate.getHour(),
                appointmentDate.getMinute() > 10 ? String.valueOf(appointmentDate.getMinute()) : String.format("0%d", appointmentDate.getMinute()),
                isAfternoonAppointment(appointmentDate) ? "PM" : "AM"
        );
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDateTime.now().getYear(), 9, 15);
    }
}
