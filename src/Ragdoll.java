public class Ragdoll extends Cats{
    private String eyeColor;
    public Ragdoll(String name, boolean isCute, String eyeColor) {
        super(name, isCute);
        this.eyeColor = eyeColor;
    }
    public void isBlue(){
        if(eyeColor.equals("blue")){
            System.out.println("My eye color is blue!");
        }else{
            System.out.println("My eye color is not blue!");
        }
    }
}
