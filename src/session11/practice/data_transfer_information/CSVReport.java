package session11.practice.data_transfer_information;

public class CSVReport extends Report implements CSVExportable {

    @Override
    public void showPreview() {
        super.displayMetadata();
        //from abstract class
    }

    @Override
    public void exportToCsv() {
        //from interface
    }
}
