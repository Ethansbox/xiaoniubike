package cn.edu360.xiaoniubike.controller;

import cn.edu360.xiaoniubike.pojo.Bike;
import cn.edu360.xiaoniubike.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.GeoResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @RequestMapping("/bike/add")
    @ResponseBody
    public  String add(@RequestBody Bike bike){
//        System.out.println(bike);
        bikeService.save(bike);
        return "success";
    }


    @RequestMapping("/bike/findNear")
    @ResponseBody
    public List<GeoResult<Bike>> findNear(double longitude, double latitude){
        List<GeoResult<Bike>> bikeList = bikeService.findNear(longitude,latitude);
        return bikeList;
    }


}
