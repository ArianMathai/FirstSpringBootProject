package no.kristiania.firstspringboot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PartsRepository {

    private ArrayList<Part> partsList = new ArrayList<>();

    public PartsRepository() {
        partsList.add(new Part("gear"));
        partsList.add(new Part("cog"));
        partsList.add(new Part("wheel"));
    }

    public ArrayList<Part> getPartsList() {
        return partsList;
    }

    public void addParts(Part part) {
        partsList.add(part);
    }

    public void deletePart(Part part){
        int id = partsList.indexOf(part);
        partsList.remove(id);
    }
    public void modifyPart(Part part, Part newPart){
        int id = partsList.indexOf(part);
        partsList.remove(id);
        partsList.add(id, newPart);
    }
}
