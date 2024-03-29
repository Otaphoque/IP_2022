package pack.View.Customs;

import javafx.scene.control.TextField;

public class CustomTextField extends TextField {

    public CustomTextField() {
        this.setPrefSize(80, 25);
        this.setStyle("-fx-background-color: #A0A0A0"); // Light Grey
    }

    public boolean checkField() {
        if (!isNumeric(this.getText())) {
            this.setStyle("-fx-background-color: #DF5C58");
            return true;
        } else {
            this.setStyle("-fx-background-color: #A0A0A0");
            return false;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
