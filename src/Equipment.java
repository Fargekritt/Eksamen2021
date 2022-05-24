public abstract class Equipment {

    private int id;
    private String location;
    private boolean needsReplacement;

    public Equipment(int id, String location, boolean needsReplacement){
        this.id = id;
        this.location = location;
        this.needsReplacement = needsReplacement;
    }

    public boolean needsReplacement(){
        return needsReplacement;
    }

    public int getId(){
        return  id;
    }

    public String getLocation(){
        return location;
    }

    public void replace(){
        needsReplacement = false;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", needsReplacement=" + needsReplacement +
                '}';
    }
}
