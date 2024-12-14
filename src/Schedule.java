import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Event> events;

    public Schedule() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event){
        events.add(event);
    }

    public void printAllEvents(){
        if (events.isEmpty()){
            System.out.println("Розклад порожній");
        } else {
            for (Event event : events){
                System.out.println(event);
            }
        }
    }

    public void delatePastEvents() {
        events.removeIf(event -> event.getDataTime().isBefore(LocalDateTime.now()));
    }


    public List<Event> getEventsByDate(LocalDate date) {
        List<Event> eventsOnDate = new ArrayList<>();
        for (Event event : events) {
            if (event.getDataTime().toLocalDate().equals(date)) {
                eventsOnDate.add(event);
            }
        }
        return eventsOnDate;
    }



}
