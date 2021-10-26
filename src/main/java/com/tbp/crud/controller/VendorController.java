package com.tbp.crud.controller;

import com.tbp.crud.dao.UserRepository;
import com.tbp.crud.dao.VendorRepository;
import com.tbp.crud.entity.Request;
import com.tbp.crud.entity.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VendorController {
    @Autowired
    VendorRepository vendorRepository;
    @ResponseBody
    @PostMapping("/vendor")
    public Vendor addUser(@RequestBody Vendor vendor) {

        return vendorRepository.saveUser(vendor);

    }
    @ResponseBody
    @GetMapping("/vendors")
    public List<Vendor> getUser()  {
        return vendorRepository.allUsers();
    }

}
