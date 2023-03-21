public class munchkin extends Cats{
    private int legInches;
    public munchkin(String name, boolean isCute, int legInches) {
        super(name, isCute);
        this.legInches = legInches;
    }
    public void leg(){
        if(legInches < 3){
            System.out.println("I'm really really short.");
        }else{
            System.out.println("I'm really short.");
        }
    }
}
