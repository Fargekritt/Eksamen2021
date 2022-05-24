import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Program program = new Program();
        ArrayList<Equipment> equipmentArrayList;
        equipmentArrayList = program.readEquipmentsFromFile("equipmentText.txt");
//        for (Equipment e: equipmentArrayList) {
//            System.out.println(e);
//        }

        program.printBallsNeedingMoreAir();

        program.printEquipmentNeedingToBeReplaced();

        program.printTableTennisRacketsNeedingNewPad();

    }
}
