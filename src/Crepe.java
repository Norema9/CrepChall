import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

enum CrepeState{BEING_PREPARED, READY, LATE, OVERCOOKED}
public class Crepe {
    private Customer custWhoOrdIt;
    private String flavor;
    private String crepeFile;
    private ArrayList<Ingredient> toppings;
    private CrepeState crepeState;
    private LocalDateTime crepeStartTime;
    // private long preparationTime; // let it here
    private int degreeOfDoneness = 0;


    public Crepe(Customer custWhoOrdIt) {
        this.custWhoOrdIt = custWhoOrdIt;
        this.crepeStartTime = LocalDateTime.now();

    }

    public Crepe(ArrayList<Ingredient> toppings, String crepeFile, String flavor) {
        this.crepeState = CrepeState.BEING_PREPARED;
        this.flavor = flavor;
        this.toppings = toppings;
        this.crepeFile = crepeFile;
    }

    public void addIngredient(Ingredient ingredient){
        toppings.add(ingredient);
    }

    public void delIngredient(Ingredient ingredient){
        if (toppings.contains(ingredient)){
            toppings.remove(ingredient);
        }
    }

    public void update(){
        System.out.println(crepeState);
        LocalDateTime currentTime = LocalDateTime.now();
        // to get the duration between the date when the preparation of the crepe started and now
        Duration duration = Duration.between(crepeStartTime, currentTime);
        // To conversion to millisecond
        long crepeDuration = duration.toMillis();
        switch (crepeState){
            case BEING_PREPARED :
                // We check if the degree of cooking is between 95% and 105% and if it is the same than
                // the right one which is ordered by the customer
                if(((degreeOfDoneness <= 95) || (degreeOfDoneness >= 105))
                        && this.isTheSame(custWhoOrdIt.getRealOrder())){
                    crepeState = CrepeState.READY;
                }
                // We check if the degree of cooking is exceeded or not
                else if(degreeOfDoneness > 105){
                    crepeState = CrepeState.OVERCOOKED;
                }
                // We check if the duration of cooking is exceeded or not
                    // if yes, the crepe is LATE
                else if(crepeDuration > custWhoOrdIt.getPeriod()){
                    crepeState = CrepeState.LATE;
                }
                break;
        }
    }

    public boolean isTheSame(Crepe crepe){
        if(toppings.containsAll(custWhoOrdIt.getRealOrder().toppings)
                && custWhoOrdIt.getRealOrder().getToppings().containsAll(toppings)){
            return true;
        }
        else{
            return false;
        }
    }

    // The getters of this classes
    public String getFlavor() { return flavor; }
    public String getCrepeFile() { return crepeFile; }
    public ArrayList<Ingredient> getToppings() { return toppings; }
    public CrepeState getCrepeState() { return crepeState; }

    // The setters of this classes
    public void setCrepeState(CrepeState crepeState) { this.crepeState = crepeState; }
}
