package com.rbpo.dnevnik;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;

import java.io.IOException;
import java.util.Calendar;

public class Dnevnik extends TabPane {
    public Dnevnik() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dnevnik.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        setCurrentDayOfWeekTab();
        setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

    }

    private void setCurrentDayOfWeekTab() {
        int dow = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        int initTab = (dow == Calendar.SUNDAY || dow == Calendar.SATURDAY) ? 0 : dow - 1;
        getSelectionModel().select(initTab);
    }

    @FXML
    private void tabOpened() {
        System.out.println(getSelectionModel().getSelectedIndex());
    }
}
