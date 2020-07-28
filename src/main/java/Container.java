
public class Container {
    private int liquid;

    public Container() {
        this.liquid = 0;
    }
    
    public int contains(){
        return this.liquid;
    }
    public void add(int amount){
        if(amount < 0){
            amount = 0;
        }
        this.liquid = this.liquid + amount;
        if(this.liquid > 100){
            this.liquid = 100;
        }
    }
    public void remove(int amount){
        if(amount < 0){
            amount = 0;
        }       
        if(this.liquid >= amount){            
            this.liquid = this.liquid - amount;                   
        } else {            
            this.liquid = this.liquid - contains();          
        }
    }
    @Override
    public String toString(){
       return this.liquid + "/100"; 
    }
}
