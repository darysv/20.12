module ru.bolshakova.bolshakova_task10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task10 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task10;
}