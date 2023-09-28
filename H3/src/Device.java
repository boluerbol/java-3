public class Device{
    protected String type;
    protected double price;
    protected double weight;
    
    public Device(){}
    // this is a constructor 
    public Device(String t,double p, double w){
        this.type = t;
        this.price =p;
        this.weight = w;
    }
    // --------------------------------

    // Those are a getters and setters 
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    // -----------------------------------  
}

