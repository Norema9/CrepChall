import java.time.LocalDateTime;

enum State{ORDER_WAIT, FOOD_WAIT}

public class Customer {
    private final String imageFile;
    private final LocalDateTime startTime;
    private LocalDateTime endTime;
    private State state;
    private Crepe idealOrder;
    private Crepe realOrder;

    public Customer(String name, String imageFile, Crepe idealOrder) {
        this.imageFile = imageFile;
        this.startTime = LocalDateTime.now();
        this.state = state.ORDER_WAIT;
        this.idealOrder = idealOrder;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public State getState() {
        return state;
    }

    public Crepe getIdealOrder() {
        return idealOrder;
    }

    public Crepe getRealOrder() {
        return realOrder;
    }
}
