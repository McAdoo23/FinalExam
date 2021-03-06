package ch.makery.address.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.UUID;

import base.RateDAL;
import ch.makery.address.MainApp;
import ch.makery.address.model.Rate;


public class MortgageController {


    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    @FXML
    public TextField txtExpenses;
    @FXML
    public TextField txtIncome;
    @FXML
    public TextField txtHouseCost;
    @FXML
    public TextField txtCreditScores;
    @FXML
    public ComboBox cmbTerm;
    @FXML
	public Button btnCalculate;
    
    
    public MortgageController() {
    	

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {

    }
   
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    public void handleComboBtn(){
        ObservableList<String> options = 
        	FXCollections.observableArrayList(
        		        "15",
        		        "30"   
        		    );
        		final ComboBox cmbTerm = new ComboBox(options);
        }
    private void handleValues(){
    	Rate.setText(txtHouseCost.getText());
    	}
    }
   
}