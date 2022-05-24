public class TableTennisRacket extends Equipment{

    private boolean needsNewPad;

    public TableTennisRacket(int id, String location, boolean needsReplacement, boolean needsNewPad) {
        super(id, location, needsReplacement);
        this.needsNewPad = needsNewPad;
    }

    public boolean needsNewPad(){
        return needsNewPad;
    }

//    public void replacePad(){
//        needsNewPad = false;
//    }

    public void setNeedsNewPad(boolean needsNewPad){
        this.needsNewPad = needsNewPad;
    }

    @Override
    public String toString() {
        return "TableTennisRacket{" +
                "needsNewPad=" + needsNewPad +
                "} " + super.toString();
    }
}
