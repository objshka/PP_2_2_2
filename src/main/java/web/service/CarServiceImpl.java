package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "A4", "Red"));
        cars.add(new Car("BMW", "X5", "Black"));
        cars.add(new Car("Mercedes", "S500", "White"));
        cars.add(new Car("Audi", "A4", "Red"));
        cars.add(new Car("BMW", "X5", "Black"));

        if (count > 0 && count <= cars.size()) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}
