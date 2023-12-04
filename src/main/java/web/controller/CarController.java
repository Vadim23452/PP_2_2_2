package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

@Controller
public class CarController {

  private CarService carService;

  @Autowired
  public CarController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping(value = "/cars")
  public String getListCarsByCount(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
    model.addAttribute("cars", carService.getCarsByCount(count));
    return "cars";
  }

}
