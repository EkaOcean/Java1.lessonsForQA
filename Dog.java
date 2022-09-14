package java1.lessonsforqa.lesson6;

class Dog extends Animal {
    int max_run_length = 500;
    int max_swim_length = 10;

    @Override
    void run(int run_length) {
        if ((run_length >= 0) && (run_length <= max_run_length)) {
            System.out.println("Пес пробежал " + run_length + " м.");
        } else System.out.println("Пес не смог пробежать " + run_length + " м.");
    }

    void swim(int swim_length) {
        if ((swim_length >= 0) && (swim_length <= max_swim_length)) {
            System.out.println("Пес проплыл " + swim_length + " м.");
        } else System.out.println("Пес не смог проплыть " + swim_length + " м.");
    }

}

