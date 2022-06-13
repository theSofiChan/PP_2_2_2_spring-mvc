package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServise {

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Ferrari",123,"Red"));
        cars.add(new Car("Bugatti",123,"Black"));
        cars.add(new Car("Toyota",123,"Green"));
        cars.add(new Car("Lada",123,"Dirt"));
        cars.add(new Car("UFO",123,"Unknown"));

    }

    public List<Car> showAllCars(String count){
        if(count==null){
            return cars;
        }
        if(Integer.parseInt(count)>=5){
            return cars;
        }
        return cars.subList(0,Integer.parseInt(count));
    }



}
