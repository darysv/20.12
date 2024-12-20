module ru.bolshakova.bolshakova_task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task7 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task7;
}