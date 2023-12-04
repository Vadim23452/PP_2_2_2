package web.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import web.model.Car;

@Service
public class CarServiceImpl implements CarService {

  private final List<Car> carList;

   {
    carList = new ArrayList<>();
    carList.add(new Car("Volvo","sedan", 2014));
    carList.add(new Car("Mercedes", "sedan", 2018));
    carList.add(new Car("Toyota", "hatchback", 2011));
    carList.add(new Car("Lada", "universal", 2012));
    carList.add(new Car("Geep", "pick-up", 2022));
  }

  @Override
  public List<Car> getCarsByCount(int count) {

     if (count < 0) {
       return Collections.emptyList();
     } else {
       return carList.stream().limit(count).collect(Collectors.toList());
     }

  }
}
