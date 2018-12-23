public class Villa extends House {

    private int numFloors;

    public Villa(String saleType, int price, int area, String location, String realEstateType) {
        super.saleType = saleType;
        super.price = price;
        super.area = area;
        super.location = location;
        super.realEstateType = realEstateType;
    }

    public void add(String saleType, int price, int area, String location, String realEstateType) {
        RealEstate.save(saleType, price, area,location, realEstateType);
    }

    public void search(String saleType, String realEstateType) {
        RealEstate.search(saleType, realEstateType);
    }

    public void sell(int id) {
        RealEstate.delete(id);
    }

    public void setNumFloors(int numFloors) {

        this.numFloors = numFloors;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return realEstateType;
    }

    public String toString() {
        return ("Sale Type Of The Villa: " + this.saleType + "\n" + "Price Of The Villa: " + this.price +
                "\n" + "Area Of The Villa: " + this.area + "\n" + "Location Of The Villa " + this.location +
                "\n" + "Number Of Floors Of The Villa " + numFloors + "\n");
    }
}
