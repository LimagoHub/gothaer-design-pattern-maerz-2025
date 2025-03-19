package de.gothaer.db;

public class Table implements AutoCloseable{

    public Table(String selectStament) {
    }
    // 0 basiert
    public String getColumnName(int column) throws Exception {
        return null;
    }

    // 0 basiert
    // Soll mehrfach gelesen werden koennen
    public String getValue(int column) throws Exception {
        return null;
    }

    public String getValue(String columnName) throws Exception {
        return null;
    }

    public boolean next() throws Exception {
        return false;
    }

    public long getColumnCount() throws Exception {
        return 0;
    }

    @Override
    public void close() throws Exception {

    }
}
