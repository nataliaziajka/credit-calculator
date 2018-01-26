package com.natalia.bank.Controllers;

import com.natalia.bank.Models.CreditModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexGet(Model model) {
        return "index";
    }

    /*@GetMapping("/calculator")
    public String subPage() {return "calculator";} */

    @GetMapping("/calculator")
    public String calculatorGet() {return "calculator";}

    @PostMapping("/calculator")

    //@PostMapping("/calculator")

    public String calculatorPost(@ModelAttribute("creditModel") CreditModel creditModel, Model model) {

        model.addAttribute("possibleInstallments", creditModel.calculatePossibleInstallments());
        model.addAttribute("income", creditModel.getIncome());
        model.addAttribute("amount", creditModel.getAmount());

        model.addAttribute("requestedInstallments", creditModel.getNumberOfInstallments());

        return "calculator";

    }

}


