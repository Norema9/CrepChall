import java.time.LocalDateTime;
import java.util.ArrayList;

enum CustomerState{ORDER_WAIT, FOOD_WAIT}

public class Customer {
    private final String imageFile;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private CustomerState customerState;
    private Crepe idealOrder;
    private Crepe realOrder;

    public Customer(String name, String imageFile, Crepe idealOrder) {
        this.imageFile = imageFile;
        this.startTime = LocalDateTime.now();
        this.customerState = CustomerState.ORDER_WAIT;
        this.idealOrder = idealOrder;
    }

    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public CustomerState getState() { return customerState; }
    public Crepe getIdealOrder() { return idealOrder; }
    public Crepe getRealOrder() { return realOrder; }

    public void update(long time, ArrayList<String> input){
        System.out.println(customerState);
        switch (customerState){
            case ORDER_WAIT:
                break;
            case FOOD_WAIT:
                break;
        }
    }
}
