module com.happytails {
    requires MaterialFX;
    requires fr.brouillard.oss.cssfx;
    requires java.sql;


    opens com.happytails to javafx.fxml;
    exports com.happytails;
    exports com.happytails.controllers;
    opens com.happytails.controllers to javafx.fxml;
}