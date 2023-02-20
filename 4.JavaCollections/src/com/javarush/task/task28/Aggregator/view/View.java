package com.javarush.task.task28.Aggregator.view;

import com.javarush.task.task28.Aggregator.Controller;
import com.javarush.task.task28.Aggregator.vo.Vacancy;

import java.util.List;

public interface View {

    void update(List<Vacancy> vacancies);

    void setController(Controller controller);
}
