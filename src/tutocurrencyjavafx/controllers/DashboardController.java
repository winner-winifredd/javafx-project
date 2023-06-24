package tutocurrencyjavafx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class TutoDashboardController {

    @FXML
    private AnchorPane anchorPaneConv;

    @FXML
    private AnchorPane anchorPaneHistCurr;

    @FXML
    private AnchorPane anchorPaneSymbCurr;

    @FXML
    private TableColumn<?, ?> col1Symbols;

    @FXML
    private TableColumn<?, ?> col2Signification;

    @FXML
    private ComboBox<?> comboBoxChooSymb;

    @FXML
    private ComboBox<?> comboBoxFrom;

    @FXML
    private ComboBox<?> comboBoxTo;

    @FXML
    private Text convLabel1;

    @FXML
    private Text convLabel2;

    @FXML
    private Text convLabel3;

    @FXML
    private Button convertBtn;

    @FXML
    private LineChart<?, ?> lineChart;

    @FXML
    private Button sbConvBtn;

    @FXML
    private Button sbHistCurr;

    @FXML
    private Button sbSymbCurr;

    @FXML
    private Button searchBtn;

    @FXML
    private TableView<?> tableView;

    @FXML
    private Text tbTitle1;

    @FXML
    private Text tbTitle2;

    @FXML
    private TextField txtFieldAmount;

    @FXML
    private TextField txtFieldSearch;

    @FXML
    void eventComboBoxGraph(ActionEvent event) {

    }

    @FXML
    void eventConvBtn(ActionEvent event) {

    }

    @FXML
    void eventSearchBtn(ActionEvent event) {

    }

    @FXML
    void eventSideBar(ActionEvent event) {
        if (event.getSource() == sbConvBtn) {
            anchorPaneConv.setVisible(true);
            anchorPaneSymbCurr.setVisible(false);
            anchorPaneHistCurr.setVisible(false);
            tbTitle1.setText("Home/Converter");
            tbTitle2.setText("Converter");

        }
        else if (event.getSource() == sbSymbCurr) {
            anchorPaneConv.setVisible(false);
            anchorPaneSymbCurr.setVisible(true);
            anchorPaneHistCurr.setVisible(false);
            tbTitle1.setText("Home/symbol currencies");
            tbTitle2.setText("SymbolCurrencies");
        }
        else if (event.getSource() == sbHistCurr) {
            anchorPaneConv.setVisible(false);
            anchorPaneSymbCurr.setVisible(false);
            anchorPaneHistCurr.setVisible(true);
            tbTitle1.setText("Home/historical currency");
            tbTitle2.setText("HistoricalCurrency");
        }
        }

    }

