import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    private ArrayList<Equipment> equipmentArrayList;

    public Program(){
        equipmentArrayList = new ArrayList<>();
    }
    public ArrayList<Equipment> readEquipmentsFromFile(String path) {

        File file = new File(path);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String equipmentType = reader.nextLine();
                if (equipmentType.equals("Ball")) {
                    equipmentArrayList.add(readBallFromFile(reader));
                } else if (equipmentType.equals("TableTennisRacket")) {
                    equipmentArrayList.add(readTableTennisRacketFromFile(reader));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return equipmentArrayList;
    }

    private Ball readBallFromFile(Scanner reader) {
        int id = Integer.parseInt(reader.nextLine());
        String location = reader.nextLine();
        boolean needsReplacement = Boolean.parseBoolean(reader.nextLine());
        String typeOfBall = reader.nextLine();
        boolean needsMoreAir = Boolean.parseBoolean(reader.nextLine());

        return new Ball(id, location, needsReplacement, typeOfBall, needsMoreAir);
    }

    private TableTennisRacket readTableTennisRacketFromFile(Scanner reader) {
        int id = Integer.parseInt(reader.nextLine());
        String location = reader.nextLine();
        boolean needsReplacement = Boolean.parseBoolean(reader.nextLine());
        boolean needsNewPad = Boolean.parseBoolean(reader.nextLine());

        return new TableTennisRacket(id, location, needsReplacement, needsNewPad);
    }

    public void printBallsNeedingMoreAir() {
        for (Equipment equipment : equipmentArrayList) {
            if(equipment instanceof Ball){
                Ball ball = (Ball) equipment;
                if (ball.needsMoreAir()){
                    System.out.println(ball);
                }
            }
        }
    }

    public void printTableTennisRacketsNeedingNewPad(){
        for (Equipment equipment: equipmentArrayList) {
            if(equipment instanceof TableTennisRacket){
                TableTennisRacket racket = (TableTennisRacket) equipment;
                if(racket.needsNewPad()){
                    System.out.println(racket);
                }
            }
        }

    }

    public void printEquipmentNeedingToBeReplaced(){
        for (Equipment equipment: equipmentArrayList) {
            if(equipment.needsReplacement()){
                System.out.println(equipment);
            }
        }
    }
}
