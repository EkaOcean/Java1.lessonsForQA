package java1.lessonsforqa.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return "Пришел котик " + "по кличке " + name + " с аппетитом " + appetite + ". Котик смог поесть и остлся сыт? - " + isFull ;
    }
    public void eat(Plate plate){
       if (plate.getFoodAmount() > appetite) {
           plate.decreaceFood(appetite);
           isFull = true;
       }
    }
}
