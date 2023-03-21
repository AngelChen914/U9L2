public class Cats {
    private String name;
    private boolean isCute;
    public Cats(String name, boolean isCute){
        this.name = name;
        this.isCute = isCute;
    }
    public String getName(){
        return name;
    }
    public boolean getIsCute(){
        return isCute;
    }
    public void nap(){
        System.out.println("I have taken a nap!");
    }
}
