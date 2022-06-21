package com.example.studentmanagementsystem;

import Database.StudentDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class TableViewController {

@FXML
private TableView<Student> studentiTablicaTv;
@FXML
private  Button pretraziBtn;
@FXML
private  TextField upisiImeTf;
@FXML
private  TableColumn<Student,UUID> oibTc ;
@FXML
private  TableColumn<Student,UUID> studentIdTc;
@FXML
private  TableColumn<Student,String> imeTc;
@FXML
private  TableColumn<Student,String> prezimeTc;
@FXML
private  TableColumn<Student, LocalDate> datumRodenjaTc;



public void prikazi(ActionEvent event){
    StudentDatabase sdb = new StudentDatabase();
    sdb.generateDataInDatabase();

}

public void pretraziStudenta(ActionEvent event){

    StudentDatabase sdb = new StudentDatabase();
    sdb.generateDataInDatabase();

   Student student =  sdb.findStudentsByName(upisiImeTf.getText());
   ObservableList<Student> list = FXCollections.observableArrayList(student);
   oibTc.setCellValueFactory(new PropertyValueFactory<Student, UUID>("oib"));
   studentIdTc.setCellValueFactory(new PropertyValueFactory<Student, UUID>("studentId"));
   imeTc.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
    prezimeTc.setCellValueFactory(new PropertyValueFactory<Student, String>("lastName"));
    datumRodenjaTc.setCellValueFactory(new PropertyValueFactory<Student, LocalDate>("dateOfBirth"));

    studentiTablicaTv.setItems(list);



}






}
