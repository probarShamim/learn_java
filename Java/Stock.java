//9.2 problem
public class Stock{
    String symbol;
    String name;
    double prevPrice;
    double currPrice;

    //constructor
    Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }

    //Symbol and name
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }

    //set Prices
    public void setprev(double value){
        this.prevPrice = value;
    }
    public void setCurr(double value){
        this.currPrice = value;
    }
    
    //method
    double getChangePercent(){
        return ((currPrice - prevPrice) / prevPrice) * 100;
    }
    public static void main(String [] args){
    Stock s1 = new Stock("ORCL","Oracle Corporation");
    s1.setprev(34.5);
    s1.setCurr(34.35);

    double ans = s1.getChangePercent();

    System.out.println("Stock Name: "+s1.getName());
    System.out.println("Stock Symbol: "+s1.getSymbol());    
    System.out.println("Price Change percentence: "+ans);        
    }
    
} 