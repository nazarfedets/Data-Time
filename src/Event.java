import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private String name;
    private LocalDateTime dataTime;
    private  String location;

    public Event(String name, LocalDateTime dataTime, String location) {
        this.name = name;
        this.dataTime = dataTime;
        this.location = location;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return "Захід: [" + name + "], Дата: [" + dataTime.format(formatter) + "], Місце: [" + location + "]";
    }
}
