package application.main;
import java.io.IOException;

interface Loadable {
    /** Loads data from a file to fill out the database upon initialization.
     * @param filename must be a .csv file
     * @throws IOException if the file cannot be found.
     */
    void load_from_file(String filename) throws IOException;
}
