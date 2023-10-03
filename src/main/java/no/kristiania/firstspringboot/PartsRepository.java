package no.kristiania.firstspringboot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PartsRepository {

    private ArrayList<Part> parts = new ArrayList<>();

    public PartsRepository() {
        parts.add(new Part("gear"));
        parts.add(new Part("cog"));
        parts.add(new Part("wheel"));
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void addParts(Part part) {
        parts.add(part);
    }

    public void deletePart(Part part){
        int id = parts.indexOf(part);
        parts.remove(id);
    }
    public void modifyPart(Part part, Part newPart){
        int id = parts.indexOf(part);
        parts.remove(id);
        parts.add(id, newPart);
    }
}
