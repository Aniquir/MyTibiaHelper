package com.example.storeservice.service;


import com.example.storeservice.dto.MountDTO;
import com.example.storeservice.vm.MountVM;

public interface MountService {

    MountVM create(MountDTO mountDto);

}
