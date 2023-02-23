package com.javarush.task.task36.MVC.view;

import com.javarush.task.task36.MVC.controller.Controller;
import com.javarush.task.task36.MVC.model.ModelData;

public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);
}