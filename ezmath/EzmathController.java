

import java.util.ResourceBundle;
import info.util.javafx.FXUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * Classe contrôleur pour l'interface décrite dans le document <b>ezmath.fxml</b>.
 *
 * Cette classe contient principalement les méthodes appelées en réaction aux événements utilisateur.  
 * Une instance de cette classe est créée automatiquement chaque fois que le document <b>ezmath.fxml</b> est chargé.
 */
public class EzmathController {
    @FXML
    private Stage stage;
    private ResourceBundle bundle;
    
    /**
     * Constructeur.
     */
    public EzmathController() {
        this.bundle = ResourceBundle.getBundle("ezmath");
    }

    /**
     * Méthode invoquée automatiquement après instanciation de ce contrôleur par JavaFX.
     */
    @FXML
    protected void initialize() {
        // initialisations supplémentaires des composants graphiques qui le nécessitent
    }
    
    /**
     * Méthode invoquée lorsque la fenêtre dont la scène est associée à ce contrôleur
     * est affichée.
     * Si nécessaire, complétez cette méthode pour exécuter du code après l'affichage de
     * la fenêtre.
     */
    @FXML
    public void onWindowShown() {
        
    }

    /**
     * Méthode invoquée lorsque la fenêtre dont la scène est associée à ce contrôleur
     * est sur le point d'être fermée par le système.
     * Si nécessaire, complétez cette méthode pour autoriser/empêcher la fermeture
     * de la fenêtre.
     * 
     * @return {@code true} si la fenêtre peut être fermée, ou {@code false}
     *         sinon (par exemple pour permettre à l'utilisateur d'enregistrer
     *         un document).
     * 
     */
    @FXML
    public boolean onWindowCloseRequest() {
        return true;
    }

}
