package champollion;
import java.util.*;

public class Intervention {
    private  Date debut;
    private  Salle salle;
    private  UE ue;
    private  Enseignant enseignant;
    private  int duree;
    private  TypeIntervention type;
    private  boolean annulee;
    
    public Intervention(Salle salle, UE ue, Enseignant enseignant, Date debut, int duree, TypeIntervention type){
        this.salle = salle;
        this.ue = ue;
        this.debut = debut;
        this.enseignant = enseignant;
        this.duree = duree;
        this.type = type;
        this.annulee = false;
        
    }
    public Date getDebut(){
        return debut;
    }     
    
    public Salle getSalle(){
        return salle;
}
    
    public UE getUe(){
        return ue;
    }
    
    public Enseignant getEnseignant(){
        return enseignant;
    }

    public int getDuree(){
        return duree;
    }
    
    public TypeIntervention getType(){
            return type;
}
    
    public boolean isAnnulee(){
        return annulee;
    }
}
