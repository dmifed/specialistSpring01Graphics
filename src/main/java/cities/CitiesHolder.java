package cities;

import java.util.ArrayList;
import java.util.List;


//Singleton
public class CitiesHolder {
    private static List<City> cities;

    private CitiesHolder(){
        cities = new ArrayList<City>();
        System.out.println("cities");
    }


    private static final class Holder{
        private static final CitiesHolder instance(){
            return new CitiesHolder();
        }
    }

    public CitiesHolder getCitiesHolder(){
        return Holder.instance();
    }

    public static List<City> getCities() {
        return cities;
    }

    public static boolean addCity(City city){
        if(!cities.contains(city)){
            cities.add(city);
            return true;
        }
        return false;
    }
}
