module ru.bolshakova.bolshakova_task11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task11 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task11;
}