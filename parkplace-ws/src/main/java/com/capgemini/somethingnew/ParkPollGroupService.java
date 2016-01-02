/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.somethingnew;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author advena
 */
@Service
public class ParkPollGroupService {

    public ParkPollGroups getParkPollGroups() {
        RestTemplate restTemplate = new RestTemplate();
        ParkPollGroups parkPollGroups = restTemplate.getForObject("http://parking.descont.pl/parking.xml", ParkPollGroups.class);
        return parkPollGroups;
    }
}
