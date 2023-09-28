public class Smartphone extends Device {
    private int camera;
    private String color;

    public Smartphone(String t , double p , double w, int ca, String co){
        super(t,p,w);
        this.camera = ca;
        this.color = co;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        return " Type " + super.getType() + " Price " + super.getPrice() + " Weight " + super.getWeight() + " Camera " + getCamera()+ " Color " + getColor();
    }
}
