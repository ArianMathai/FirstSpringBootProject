package no.kristiania.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsService {

    @Autowired
    private PartsRepository partsRepository;

    public List<Part> getParts(){
        return partsRepository.getParts();
    }

    public void addPart(Part part){
        partsRepository.addParts(part);
    }
    public void deletePart(String name){
        partsRepository.deletePart(new Part(name));
    }
    public void modifyPart(String name, Part part){
        partsRepository.modifyPart(new Part(name), part);
    }
}
