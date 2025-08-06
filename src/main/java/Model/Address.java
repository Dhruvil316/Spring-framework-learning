package Model;

public class Address {
    private long pincode ;
    private String city ;


//    on frontend form : we do like this address.pincode in name , address.city ;
    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode=" + pincode +
                ", city='" + city + '\'' +
                '}';
    }
}
