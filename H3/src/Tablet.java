public class Tablet extends Device {
    private String brend;
    private String country;

    public Tablet(String t , double p , double w,String b, String c){
        super(t,p,w);
        this.brend = b;
        this.country = c;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return " Type " + super.getType() + " Price " + super.getPrice() + " Weight " + super.getWeight() + " Counrty " + getCountry()+ " Brend " + getBrend();
    }
}
