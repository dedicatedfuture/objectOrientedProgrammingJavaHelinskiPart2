
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);


    }

    public static void addSuitcasesFullOfBricks(Container container){
        int newBrickWeight = 1;
        for(int i =0; i < 100; i++){
            Thing brick = new Thing("Brick", newBrickWeight);
            Suitcase newCase = new Suitcase(100);
            newCase.addThing(brick);
            container.addSuitcase(newCase);
            if (brick.getWeight() < 100){
                newBrickWeight++;
            }
        }

    }

}
