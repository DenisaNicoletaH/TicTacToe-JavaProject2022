module com.example.tictactoejavaproject2022 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.tictactoejavaproject2022 to javafx.fxml;
    exports com.example.tictactoejavaproject2022;
}