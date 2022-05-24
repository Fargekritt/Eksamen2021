public class Ball extends Equipment{

    private String typeOfBall;
    private boolean needsMoreAir;

    public Ball(int id, String location, boolean needsReplacement, String typeOfBall, boolean needsMoreAir) {
        super(id, location, needsReplacement);
        this.typeOfBall = typeOfBall;
        this.needsMoreAir = needsMoreAir;
    }

    public boolean needsMoreAir(){
        return needsMoreAir;
    }

    public String getTypeOfBall(){
        return typeOfBall;
    }

    public void fillAir(){
        needsMoreAir = false;
    }

    public void setNeedsMoreAir(boolean needsMoreAir){
        this.needsMoreAir = needsMoreAir;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "typeOfBall='" + typeOfBall + '\'' +
                ", needsMoreAir=" + needsMoreAir +
                "} " + super.toString();
    }
}
