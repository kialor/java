package abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviations(String abbreviation, String explanation){
        this.abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(this.abbreviations.containsKey(abbreviation)){
            return true;
        }else{
            return false;
        }
    }

    public String findExplanationFor(String abbreviation){
        if(this.hasAbbreviation(abbreviation)){
            return this.abbreviations.get(abbreviation);
        }else{
            return null;
        }
    }
}
