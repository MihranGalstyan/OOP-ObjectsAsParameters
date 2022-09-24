/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Box {
    double height;
    double width;
    double length;


    Box() {
        height = 10;
        width = 10;
        length = 10;
    }

    Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    double getVolume() {
        return height * width * length;
    }

//    void compareByVolume(Box box){
//        double thisBoxVolume = getVolume();
//        double newBoxVolume = box.getVolume();
//
//        if (thisBoxVolume > newBoxVolume){
//            System.out.println("This box is bigger");
//        } else if (thisBoxVolume < newBoxVolume) {
//            System.out.println("This box is smaller");
//        } else {
//            System.out.println("Both boxes are equal");
//        }
//    }

    int compareByVolume(Box box) {
        double thisBoxVolume = getVolume();
        double newBoxVolume = box.getVolume();

        if (thisBoxVolume > newBoxVolume) {
            return 1;
        } else if (thisBoxVolume < newBoxVolume) {
            return -1;
        } else {
            return 0;
        }
    }

    static Box increase(Box box, int multiplier) {
        return new Box(box.height * multiplier, box.width * multiplier, box.length * multiplier);
    }

    Box increase(Box box) {
        return new Box(box.height + height, box.width + width, box.length + length);
    }
}
