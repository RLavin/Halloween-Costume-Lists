package com.ironyard.controller;

import com.ironyard.data.costume;
import com.ironyard.repositories.HalloweenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.sql.SQLException;
import java.util.List;

/**
 * Created by Raul on 10/12/16.
 */
@RestController

public class HalloweenController {

    private HalloweenRepository halloweenRepository ;

    @Autowired
    public void setHalloweenRepository (HalloweenRepository  aRepo){
        this.halloweenRepository = aRepo;
    }

    /**
     * Saves a costume object to database.  It will auto generate an id as well.
     * @param aCostume
     * @return
     */
    @RequestMapping(value = "/costume", method = RequestMethod.POST)
    public costume save(@RequestBody costume aCostume){
        halloweenRepository.save(aCostume);
        return halloweenRepository.findOne(aCostume.getId());
    }

    /**
     * Updates the costume object to database by id
     * @param aCostume
     * @return
     */
    @RequestMapping(value = "/costume/update", method = RequestMethod.PUT)
    public costume update(@RequestBody costume aCostume){
        halloweenRepository.save(aCostume);
        return halloweenRepository.findOne(aCostume.getId());
    }

    /**
     * Shows costumes object by a specific id
     * @param id
     * @return
     */
    @RequestMapping(value = "/costume/{id}", method = RequestMethod.GET)
    public costume show(@PathVariable Long id){
        return halloweenRepository.findOne(id);
    }

    /**
     * Shows all costumes in a list
     * @return
     */
    @RequestMapping(value = "/costumes", method = RequestMethod.GET)
    public Iterable<costume> list(){
        return halloweenRepository.findAll();
    }

    /**
     * Deletes costume object also by id
     * @param id
     * @return
     */
    @RequestMapping(value = "/costume/delete/{id}", method = RequestMethod.DELETE)
    public costume delete(@PathVariable Long id){
        costume deleted = halloweenRepository.findOne(id);
        halloweenRepository.delete(id);
        return deleted;
    }
}
