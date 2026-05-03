import fields.Airplane;
import java.util.Arrays;
import java.util.Comparator;

    public class Main {
        public static void main(String[] args) {
            Airplane[] fleet = {
                    new Airplane("Boeing 737", 189, 839, 5436, 2015),
                    new Airplane("Antonov An-225", 0, 850, 15400, 1988),
                    new Airplane("Airbus A320", 150, 828, 6100, 2018),
                    new Airplane("Cessna 172", 4, 226, 1289, 2005),
                    new Airplane("Boeing 747", 416, 920, 13450, 1999)
            };
            System.out.println("Початковий масив літаків:");
            printArray(fleet);
            Arrays.sort(fleet, Comparator.comparingInt(Airplane::getYearOfManufacture));
            System.out.println("\n Відстортовані літаки:");
            printArray(fleet);
            Arrays.sort(fleet, Comparator.comparingDouble(Airplane::getMaxSpeed).reversed());
            System.out.println("\n Відсотовані за максимальною швидкістю:");
            printArray(fleet);
            Airplane targetPlane = new Airplane("Airbus A320", 150, 828, 6100, 2018);
            boolean found = false;
            for (int i = 0; i < fleet.length; i++) {
                if (fleet[i].equals(targetPlane)) {
                    System.out.println("\n Знайдено ідентичний літак на індексі " + i + ": " + fleet[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Ідентичного літака в масиві не знайдено.");
            }
        }
        private static void printArray(Airplane[] arr) {
            for (Airplane plane : arr) {
                System.out.println(plane);
            }
        }
    }
