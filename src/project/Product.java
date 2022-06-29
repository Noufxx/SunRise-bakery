
package project;

/**
 *
 * @author HP
 */
public class Product {
    private String id;
    private String name;
    private String type;
    private String price;
    private byte[] Image;  
    
     public Product(){}
    
    public Product(String Id, String Name, String type, String Price,byte[] image){
    
        this.id = Id;
        this.name = Name;
        this.type=type;
        this.price = Price;
        this.Image = image;  
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }
    
    
}
