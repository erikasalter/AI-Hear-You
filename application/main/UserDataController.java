package application.main;
import java.io.IOException;

class UserDataController extends DatabaseController {

    public UserDataController(String fileName) {
        super(fileName);
    }

    public UserDataController() {
        this("default_users.csv");
    }

    /** (non-Javadoc)
     * @see application.main.DatabaseController#load_from_file(java.lang.String)
     */
    @Override
    protected void loadFromFile(String fileName) throws IOException {

    }

    //set user roles
    //remove
    //add
}