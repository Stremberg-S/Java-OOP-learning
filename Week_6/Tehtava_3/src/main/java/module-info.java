module com.teht3.tehtava_3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.teht3.tehtava_3 to javafx.fxml;
    exports com.teht3.tehtava_3;
}