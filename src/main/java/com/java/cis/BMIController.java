package com.java.cis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class BMIController {
    @RequestMapping(value = "/bmi", method = RequestMethod.POST)
    public String calculateBMI(@Validated User user, Model model) {
        System.out.println("BMI calculator");
        double bmiCalculator = (double) Math.round((user.getWeight() / (user.getHeight() * user.getHeight()) * 703) * 100) / 100;
        model.addAttribute("bmiCalculator", bmiCalculator);
        return "bmi";
    }
}
