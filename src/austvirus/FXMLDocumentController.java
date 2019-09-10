
package austvirus;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author somum
 */
public class FXMLDocumentController implements Initializable {
    
  @FXML
    private TextField txt;
    @FXML
    private Button bt;
    @FXML
    private AnchorPane anc; 
    @FXML
    private WebView webView;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        WebEngine we=webView.getEngine();
        we.setJavaScriptEnabled(true);
        
        EventHandler<ActionEvent> enter= new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
              
                we.load(txt.getText().startsWith("http://")?txt.getText():"http://"+txt.getText());
                
            }
        };
        txt.setOnAction(enter);
        bt.setOnAction(enter);
      
        we.locationProperty().addListener(new ChangeListener<String>() {
                @Override public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    txt.setText(newValue);
                }
            });
        
       
                
    }    

    @FXML
    private void handle(ActionEvent event) {
        
        
    }   
    
    @FXML
    private void handle1(ActionEvent event) {
        
        
    } 
    @FXML
    private void handle2(ActionEvent event) {
        
      
    } 
    @FXML
    private void handle3(ActionEvent event) {
        
        
    } 
}
