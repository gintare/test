package com.example.javamvc.controllers;

import com.example.javamvc.models.ForecastModel;
import com.example.javamvc.models.IndexModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ForecastController {

    @GetMapping("/")
    public ModelAndView index() {
        var modelAndView = new ModelAndView("index");

        var cities = new ArrayList<String>();
        cities.add("Vilnius");
        cities.add("Kaunas");

        var indexModel = new IndexModel();
        indexModel.cities = new ArrayList<String>();// List.of("Vilnius", "Kaunas", "Klaipeda");
        indexModel.cities.add("Vln");
        indexModel.forecasts = new ArrayList<ForecastModel>();//(ArrayList<ForecastModel>) List.of(new ForecastModel("2023-03-11 11:00", 12.00));
        indexModel.forecasts.add(new ForecastModel("2023-03-11 11:00", 12.00));

        modelAndView.addObject("cities", indexModel);

        return  modelAndView;
    }

}
