package com.poc.campaigninfoservice.resources;

import com.poc.campaigninfoservice.models.Campaign;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/camp")
public class CampInfoResource {


    @RequestMapping("/{campId}")
    public Campaign getCampInfo(@PathVariable("campId") String campId) {

        return new Campaign(campId, "Campaign - Gun Safety");

    }

}
