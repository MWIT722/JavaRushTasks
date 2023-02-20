package com.javarush.task.task28.Aggregator.model;

import com.javarush.task.task28.Aggregator.vo.Vacancy;

import java.util.List;

public interface Strategy {

    List<Vacancy> getVacancies(String searchString);
}
