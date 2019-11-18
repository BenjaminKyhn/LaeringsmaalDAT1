import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Emner;
import model.Sporgsmaal;


public class LaeringsmaalController {

    private int i = 0;
    Emner emner = new Emner();
    Sporgsmaal q = new Sporgsmaal();

    @FXML
    TextField emneTextField;

    @FXML
    TextArea spoergsmaalTextArea;

    @FXML
    private void indlaes() {
        System.out.println(emner.getEmne(i));
        emneTextField.setText(emner.getEmne(i));
        spoergsmaalTextArea.setText(q.getSporgsmaal(i) + "\n");
    }

    @FXML
    private void naeste() {
        if (i < q.getAlleSporgsmaal().size()-1)
        i++;
        indlaes();
        System.out.println(q.getAlleSporgsmaal().size());
    }

    @FXML
    private void forrige() {
        if (i > 0){
            i--;
            emneTextField.setText("");
            indlaes();
        }
    }

}
