package com.poltomo.HibernateDemo.controllers;

import com.poltomo.HibernateDemo.models.Location;
import com.poltomo.HibernateDemo.models.User;
import com.poltomo.HibernateDemo.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return locationService.findAll();
    }

    @GetMapping("/locations/{id}")
    public Optional<Location> getLocationById(@PathVariable Integer id) {
        return locationService.findById(id);
    }

    @GetMapping("/locations/{id}/users")
    public List<User> getUsersByLocation(@PathVariable Integer id) {
        Optional<Location> location = locationService.findById(id);
        if(location.isPresent()) {
            return location.get().getUsers();
        }
        return null;
    }

    @PostMapping("/locations/add")
    public void addLocation(@RequestBody Location location){
        locationService.addLocation(location);
    }
}
