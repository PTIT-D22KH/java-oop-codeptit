package J05072;
import java.util.*;
public class City {
    private String cityId, name;
    private int price;
    private static Map<String, City> cityMap = new HashMap<String, City>();
    public City(String cityId, String name, int price) {
        this.cityId = cityId;
        this.name = name;
        this.price = price;
        cityMap.put(cityId, this);
    }
    public static Map<String, City> getCityMap() {
        return cityMap;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString () {
        return name;
    }
    
}
