/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(15,12,14);
        Box box3 = Box.increase(box1, 2);

        var result = box2.compareByVolume(box1);

        switch (result){
            case 1 -> System.out.println("This box is bigger");
            case -1 -> System.out.println("This box is smaller");
            case 0 -> System.out.println("Both boxes are equal");
        }
        System.out.println(box1.getVolume());
        System.out.println(box3.getVolume());

    }
}
