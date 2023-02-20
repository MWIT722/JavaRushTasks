package com.javarush.task.task28.Aggregator;

import com.javarush.task.task28.Aggregator.model.Model;

public class Controller {

    private Model model;

    public Controller(Model model) {
        if (model == null) throw new IllegalArgumentException();
        this.model = model;
    }

    public void onCitySelect(String cityName) {
        model.selectCity(cityName);
    }
}
