
package com.example.lungcancer.controller;

import com.example.lungcancer.model.RiskRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RiskController {

    @PostMapping("/assess")
    public String assessRisk(@RequestBody RiskRequest req) {
        int score = 0;

        if (req.getAge() > 50) score++;
        if (req.getSmoker().equalsIgnoreCase("yes")) score+=2;
        if (req.getCough().equalsIgnoreCase("yes")) score++;
        if (req.getChestPain().equalsIgnoreCase("yes")) score++;
        if (req.getBreath().equalsIgnoreCase("yes")) score++;
        if (req.getFatigue().equalsIgnoreCase("yes")) score++;
        if (req.getFamilyHistory().equalsIgnoreCase("yes")) score++;
        if (req.getCoughingBlood().equalsIgnoreCase("yes")) score += 2;

        if (score >= 6) return "High risk - Please consult a doctor immediately.";
        else if (score <= 3) return "Medium risk - Consider medical advice.";
        else return "Low risk - Maintain healthy habits.";
    }
}
