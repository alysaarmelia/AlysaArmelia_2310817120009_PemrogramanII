package Soal1_Modul6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Nama_Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
	@Override
    public void start(Stage stage) {
        ObservableList<Mahasiswa> mahasiswaList = FXCollections.observableArrayList(
            new Mahasiswa("23117", "Alysa"),
            new Mahasiswa("23118", "Bagas"),
            new Mahasiswa("23119", "Celine"),
            new Mahasiswa("23120", "Damar"),
            new Mahasiswa("23121", "Ema"),
            new Mahasiswa("23122", "Farah"),
            new Mahasiswa("23123", "Giselle"),
            new Mahasiswa("23124", "Haechan"),
            new Mahasiswa("23125", "Imah"),
            new Mahasiswa("23126", "Jeno")
        );

        TableView<Mahasiswa> table = new TableView<>();
        TableColumn<Mahasiswa, String> nimColumn = new TableColumn<>("NIM");
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> namaColumn = new TableColumn<>("Nama");
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));

        table.getColumns().addAll(nimColumn, namaColumn);
        table.setItems(mahasiswaList);

        TextField nimField = new TextField();
        nimField.setPromptText("NIM");
        TextField namaField = new TextField();
        namaField.setPromptText("Nama");
        TextField a = new TextField();
        a.setPromptText("Apakah");
        Button ab = new Button("Delete");
        Button addButton = new Button("Add");

        ab.setOnAction(e -> {
            String nim = nimField.getText();
            if (!nim.isEmpty()) {
                Mahasiswa target = null;
                for (Mahasiswa m : mahasiswaList) {
                    if (m.getNim().equals(nim)) {
                        target = m;
                        break;
                    }
                }
                if (target != null) {
                    mahasiswaList.remove(target);
                    nimField.clear();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "Data mahasiswa berhasil dihapus!", ButtonType.OK);
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.WARNING, "Mahasiswa Mempunyai NIM tersebut tidak ditemukan.", ButtonType.OK);
                    alert.showAndWait();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "NIM tidak boleh kosong!", ButtonType.OK);
                alert.showAndWait();
            }
        });

        addButton.setOnAction(e -> {
            String nim = nimField.getText();
            String nama = namaField.getText();

            if (nim.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "NIM tidak boleh kosong!", ButtonType.OK);
                alert.showAndWait();
                return;
            }
            if (!nim.matches("\\d+")) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "NIM harus berupa angka!", ButtonType.OK);
                alert.showAndWait();
                return;
            }
            if (nim.length() != 5) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "NIM harus mempunyai panjang sebanyak 5 karakter!", ButtonType.OK);
                alert.showAndWait();
                return;
            }
            boolean nimExists = mahasiswaList.stream().anyMatch(m -> m.getNim().equals(nim));
            if (nimExists) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "NIM telah terdaftar!", ButtonType.OK);
                alert.showAndWait();
                return;
            }

            if (nama.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Nama tidak boleh kosong!", ButtonType.OK);
                alert.showAndWait();
                return;
            }
            if (!nama.matches("[a-zA-Z\\s]+")) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Nama hanya boleh mengandung huruf dan spasi!", ButtonType.OK);
                alert.showAndWait();
                return;
            }

            mahasiswaList.add(new Mahasiswa(nim, nama));
            nimField.clear();
            namaField.clear();
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Data mahasiswa telah berhasil ditambahkan!", ButtonType.OK);
            alert.showAndWait();
        });

        double height = 600;
        double width = 400;
        double height_v = ((height/width)*10);
        VBox layout = new VBox(height_v, table, nimField, namaField, addButton ,ab);
        Scene scene = new Scene(layout, height, width);

        stage.setScene(scene);
        stage.setTitle("Praktikum 6 - JavaFX");
        stage.show();
    }    
}
