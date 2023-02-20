package com.javarush.task.task28.Aggregator;


import com.javarush.task.task28.Aggregator.model.HHStrategy;
import com.javarush.task.task28.Aggregator.model.Model;
import com.javarush.task.task28.Aggregator.model.HabrCareerStrategy;
import com.javarush.task.task28.Aggregator.model.Provider;
import com.javarush.task.task28.Aggregator.view.HtmlView;

public class Aggregator {

    public static void main(String[] args) {
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()), new Provider(new HabrCareerStrategy()));
        Controller controller = new Controller(model);

        view.setController(controller);

        view.userCitySelectEmulationMethod();
    }
}
