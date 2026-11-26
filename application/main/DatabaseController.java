package application.main;
import java.io.IOException;

abstract class DatabaseController {

    /**
     * The name of the file used to load data upon initializing the database.
     */
    private String fileName;

    public DatabaseController(String fileName) {
        this.fileName = fileName;
        initDatabase(fileName);
    }

    /**
     * Initializes the database and loads data from a file.
     */
    public void initDatabase(String fileName) {
        try{
            loadFromFile("default_users.csv");
        } catch (IOException e) {
            System.out.println("Couldn't load data from file " + fileName);
        }
    }

    /** Loads data from a file to fill out the database upon initialization.
     * @param filename must be a .csv file
     * @throws IOException if the file cannot be found.
     */
    protected abstract void loadFromFile(String fileName) throws IOException;

    public void closeDatabase() {}

    /** 
     * Closes the database and resets all content. Refills with the default data.
     */
    public void restartDatabase() {
        closeDatabase();
        initDatabase(fileName);
    }
}