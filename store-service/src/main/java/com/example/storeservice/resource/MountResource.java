package com.example.storeservice.resource;

import com.example.storeservice.dto.MountDTO;
import com.example.storeservice.service.MountService;
import com.example.storeservice.vm.MountVM;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mount")
public class MountResource {

    private final MountService mountService;

    @PostMapping
    public ResponseEntity<MountVM> createMount(@RequestBody MountDTO mountDto) {

        return new ResponseEntity<>(mountService.create(mountDto), HttpStatus.CREATED);
    }
}
