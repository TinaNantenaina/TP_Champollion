package champollion;
import java.util.ArrayList;
import java.util.List;

public class Enseignant extends Personne {

    // TODO : rajouter les autres méthodes présentes dans le diagramme UML
    private List<ServicePrevu> prevu = new ArrayList<>();
    private List<Intervention> listeIntervention = new ArrayList<>();
    
    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        // TODO: Implémenter cette méthode
        int equivalTD= 0;
        for(ServicePrevu service : prevu){
            equivalTD += 1.5 * service.getVolumeCM();
            equivalTD += service.getVolumeTD();
            equivalTD += 0.75 * service.getVolumeTP();
        }
        return Math.round(equivalTD);

    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        // TODO: Implémenter cette méthode
        int equivalTD= 0;
        for(ServicePrevu service : prevu){
            if(service.getUE().equals(ue)) {
                equivalTD += 1.5 * service.getVolumeCM();
                equivalTD += service.getVolumeTD();
                equivalTD += 0.75 * service.getVolumeTP();
            }
        }
        return Math.round(equivalTD);
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        // TODO: Implémenter cette méthode
        Enseignant e = new Enseignant(this.getNom(),this.getEmail());
        ServicePrevu s = new ServicePrevu(ue,volumeCM,volumeTD,volumeTP,e);
        prevu.add(s);
    }
    
   /**
     * ajoute une intervention planifiée pour l'enseignant
     * @param inter lintervention a ajouter
     */
    public void ajouteIntervention(Intervention inter){
        listeIntervention.add(inter);
        
    }
    
    public List<Intervention> getListeIntervention() {
        return listeIntervention;
    }
}
