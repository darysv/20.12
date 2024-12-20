module ru.bolshakova.bolshakova_task12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task12 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task12;
}