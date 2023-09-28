public class Laptop extends Device {
    private int size;
    private String brend;

    public Laptop(String t , double p , double w,int s, String b){
        super(t,p,w);
        this.brend = b;
        this.size = s;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String toString(){
        return " Type " + super.getType() + " Price " + super.getPrice() + " Weight " + super.getWeight() + " Size " + getSize()+ " Brend " + getBrend();
    }
    

    
}
