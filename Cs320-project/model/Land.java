public class Land implements Sistem {

    private int price;
    private int area;
    private String location;
    private int id;

    public Land(int price, int area, String location) {
        this.price = price;
        this.area = area;
        this.location = location;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    public int getId() {
        this.id = id;
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }






    @Override
    public void search(String saleType, int price, int area, String location) {

    }

    @Override
    public void add(String saleType, int price, int area, String location) {

    }

    @Override
    public void sell(int id) {

    }

    public void printLand(){
        System.out.println("Price Of The Land: " + this.price +
                "\n" + "Area Of The Land: " + this.area + "\n" + "Location Of The Land " + this.location + "\n");
    }
}