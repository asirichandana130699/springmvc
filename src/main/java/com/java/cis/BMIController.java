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
        double bmiCalculator = user.getWeight() / (user.getHeight() * user.getHeight()) * 703;
        model.addAttribute("bmiCalculator", bmiCalculator);
        model.addAttribute("userName", user.getUserName());
        return "bmi";
    }
}
