package com.example.storeservice.service.mountService;

import com.example.storeservice.dto.MountDTO;
import com.example.storeservice.service.mountService.mountServiceHelper.MountServiceHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MountServiceImpl implements MountService {

    private final MountServiceHelper mountServiceHelper;

    @Override
    public void createAndSave(MountDTO mountDto) {

        mountServiceHelper.createAndSave(mountDto);
    }
}
