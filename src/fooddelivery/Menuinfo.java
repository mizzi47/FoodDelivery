
package fooddelivery;


public class Menuinfo {
    private String name;	//data fields
    private String category;
    private String price;
    
    Menuinfo(){
        name = null;
        category = null;
        price = null;
    }

    
    public Menuinfo(String nm, String ct, String pr) {
        name = nm;
        category = ct;
        price = pr;
    }

    //methods
    public void setName(String n) {
        name = n;
    }

    public void setCategory(String c) {
        category = c;
    }

    public void setPrice(String p) {
        price = p;
    }
    
    public String getName() 
    {
        return name;
    }

    public String getCategory()
    {
        return category;
    }

    public String getPrice() 
    {
        return price;
    }
    
    public String toString()
    {
        
        return ("Name: " + name   + "\ncategory : "+ category +"\nprice    : "+ "RM" + price );
    
    }

    void setName(String[] n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCategory(String[] c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPrice(String[] p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
