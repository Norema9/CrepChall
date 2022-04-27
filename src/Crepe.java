import java.util.ArrayList;

enum CrepeState{BEING_PREPARED, READY, DELIVERED, ORDERED, OVERCOOKED}
public class Crepe {
    private Customer custWhoOrdIt;
    private String flavor;
    private String crepeFile;
    private ArrayList<Ingredient> toppings;
    private CrepeState crepeState;
    private long startTime;
    private long preparationTime;
    private int degreeOfDoneness = 0;


    public Crepe(long startTime, Customer custWhoOrdIt) {
        this.custWhoOrdIt = custWhoOrdIt;
        this.crepeState = CrepeState.BEING_PREPARED;
        this.startTime = startTime;
    }

    public Crepe(ArrayList<Ingredient> toppings, String crepeFile, String flavor) {
        this.crepeState = CrepeState.ORDERED;
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

    public void update(long currentTime){
        System.out.println(crepeState);
        switch (crepeState){
            case BEING_PREPARED :
                if(degreeOfDoneness >= 100){
                    crepeState = CrepeState.READY;
                }
                else {
                    if((currentTime - startTime) > preparationTime){

                    }
                }
        }
    }

    public String getFlavor() { return flavor; }
    public String getCrepeFile() { return crepeFile; }
    public ArrayList<Ingredient> getToppings() { return toppings; }
    public long getPreparationTime() { return preparationTime; }
}
