package com.rbpo.dnevnik;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class MainWindowController {
    @FXML
    private DnevnikController dnevnik;
    @FXML
    private JournalController journal;
    @FXML
    private CalendarController calendar;
    @FXML
    private ProfileController profile;

    public MainWindowController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException();
        }
    }
}
