import java.time.LocalDateTime;
import java.util.ArrayList;

enum CustomerState{ORDER_WAIT, FOOD_WAIT}

public class Customer {
    private String crepeFile;
    private LocalDateTime startTime;
    private long period;                    // The period that he dispose
    private CustomerState customerState;
    private Crepe realOrder;

    public Customer(String crepeFile, Crepe idealOrder, long period) {
        this.crepeFile = crepeFile;
        this.startTime = LocalDateTime.now();
        this.customerState = CustomerState.ORDER_WAIT;
        this.realOrder = idealOrder;
        this.period = period;
    }

    public void update(long time){
        System.out.println(customerState);
        switch (customerState){
            case ORDER_WAIT:
                break;
            case FOOD_WAIT:
                break;
        }
    }

    // The getters of this classes
    public LocalDateTime getStartTime() { return startTime; }
    public long getPeriod() { return period; }
    public CustomerState getState() { return customerState; }
    public Crepe getRealOrder() { return realOrder; }

    // The setters of this classes
    public void setCustomerState(CustomerState customerState) { this.customerState = customerState; }
}
