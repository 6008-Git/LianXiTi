package d0709;

public class Test19 {
    public static void main(String[] args) {
        Animals animala = new Bird();
        Fish fishb = new Fish();
        animala.move();
        animala.sleep();
        fishb.sleep();
        fishb.move();
    }
}


class Animals{
    int weight;

    void move(){
        System.out.println("animals moving");
    }

    void sleep(){
        System.out.println("animals sleeping");
    }
}

class Fish extends Animals{
    @Override
    void move() {
        System.out.println("swimming");
    }

    @Override
    void sleep() {
        super.sleep();
    }
}

class Bird extends Animals{
    @Override
    void move() {
        System.out.println("flying");
    }

    @Override
    void sleep() {
        super.sleep();
    }
}