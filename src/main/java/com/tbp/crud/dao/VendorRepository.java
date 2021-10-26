package com.tbp.crud.dao;

import com.tbp.crud.entity.Request;
import com.tbp.crud.entity.Vendor;

import java.util.List;

public interface VendorRepository {
    Vendor saveUser(Vendor vendor);
    List<Vendor> allUsers();


}
