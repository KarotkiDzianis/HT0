


public class Main {
    public static void main(String[] args) {


        Building built = new Building("Prime Hall");
        built.addRoom("Room 1",100,3);
        built.addRoom("Room 2", 75,2);
        built.getRoom("Room 1").addIlluminance(new Lamp(150));
        built.getRoom("Room 1").addFurniture(new Table("desk", 3,4));
        built.describe();



}
}
