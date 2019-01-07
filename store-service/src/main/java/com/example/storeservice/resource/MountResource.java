package com.example.storeservice.resource;

import com.example.storeservice.dto.MountDTO;
import com.example.storeservice.service.mountService.MountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mount")
public class MountResource {

    private final MountService mountService;

    @PostMapping
    public ResponseEntity<HttpStatus> saveMount(@RequestBody MountDTO mountDto) {

        mountService.createAndSave(mountDto);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
