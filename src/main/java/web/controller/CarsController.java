package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.CarServise;

@Controller
public class CarsController {
    private final CarServise csi;

    @Autowired
    public CarsController(CarServise csi) {
        this.csi = csi;
    }

    @GetMapping("/cars")
    public String showAllCars(Model model, String count) {
        model.addAttribute("cars", csi.showAllCars(count));
        return "cars";
    }
}
