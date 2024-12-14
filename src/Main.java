import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        schedule.addEvent(new Event("Конференція", LocalDateTime.of(2024, 12,20,10,0), "Львів"));
        schedule.addEvent(new Event("День міста", LocalDateTime.of(2023, 6, 25, 15, 0), "Миколаїв"));

        System.out.println("Усі заходи: ");
        schedule.printAllEvents();

        schedule.delatePastEvents();
        System.out.println("\nРозклад після видалення старих заходів:");
        schedule.printAllEvents();

        LocalDate filterDate = LocalDate.of(2024, 12, 20);
        System.out.println("\nЗаходи на дату: " + filterDate);
        List<Event> eventsOnDate = schedule.getEventsByDate(filterDate);
        if (eventsOnDate.isEmpty()) {
            System.out.println("На цю дату немає заходів.");
        } else {
            for (Event event : eventsOnDate) {
                System.out.println(event);
            }
        }

    }
}