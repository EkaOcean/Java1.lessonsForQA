package java1.lessonsforqa.lesson7;

public class Plate {
    private int foodAmount;
    public Plate(int foodAmount){
        this.foodAmount = foodAmount;
    }
    public boolean decreaceFood(int appetite){
        if (foodAmount >= appetite) {
            foodAmount -= appetite;
        }
        return false;
    }
    int getFoodAmount(){
        return foodAmount;
    }
    @Override
    public String toString() {
        return "в тарелке лежит " + foodAmount + " грамм кошачьего корма.";
    }
    public void addFood(int amount){
        foodAmount += amount;
    }
}


