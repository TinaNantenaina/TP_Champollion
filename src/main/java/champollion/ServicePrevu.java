package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe
    private  int volumeCM;
    private  int volumeTD;
    private  int volumeTP;
    private  UE ue;
    private  Enseignant enseignant;
    
    public ServicePrevu(UE ue, int volumeCM, int volumeTD, int volumeTP, Enseignant enseignant){
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
        this.ue = ue;
        this.enseignant = enseignant;
    }
    
    public int getVolumeCM(){
        return volumeCM;
    }

    public int getVolumeTD(){
        return volumeTD;
    }
   
    public int getVolumeTP(){
        return volumeTP;
    }
   
    public UE getUE(){
        return ue;
    }
    
    public Enseignant getEnseignant(){
        return enseignant;
    }
}
