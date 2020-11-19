
package champollion;

class Salle {
    private final String intitule;
    private int capacite;
    
    public Salle (String intitule, int capacite){
        this.intitule = intitule;
        this.capacite = capacite;
    }
    
    public String getIntitule(){
        return intitule;
    }
    
    public int getCapacite(){
        return capacite;
    }
}
