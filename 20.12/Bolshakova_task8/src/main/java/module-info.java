module ru.bolshakova.bolshakova_task8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task8 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task8;
}