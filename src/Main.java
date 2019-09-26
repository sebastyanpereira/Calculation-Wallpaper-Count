import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter width room in meters: ");
        double widthRoom = keyboard.nextDouble();
        System.out.println("Please enter length room in meters: ");
        double lengthRoom = keyboard.nextDouble();
        System.out.println("Please enter height room in meters: ");
        double heightRoom = keyboard.nextDouble();
        System.out.println("Please enter width one roll of wallpaper in meters: ");
        double widthWallpaper = keyboard.nextDouble();
        System.out.println("Please enter length one roll of wallpaper in meters: ");
        double lengthWallpaper = keyboard.nextDouble();
        double reserveComfort  = 0.1;
        double perimeterRoom = (widthRoom + lengthRoom) * 2;
        int countBandForRoom = (int) Math.ceil(perimeterRoom / widthWallpaper);
        int countBandInRoll = (int) (lengthWallpaper / (heightRoom + reserveComfort));
        int countRollIsNeed = countBandForRoom / countBandInRoll;
        System.out.println("You need to buy " + countRollIsNeed + " rolls wallpaper");
    }
}
