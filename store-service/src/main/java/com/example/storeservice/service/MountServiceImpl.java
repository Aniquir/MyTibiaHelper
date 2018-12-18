package com.example.storeservice.service;

import com.example.storeservice.dto.MountDTO;
import com.example.storeservice.entity.Mount;
import com.example.storeservice.repository.MountRepository;
import com.example.storeservice.vm.MountVM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MountServiceImpl implements MountService {

    private final MountRepository mountRepository;

    @Override
    public MountVM create(MountDTO mountDto) {

        Mount mount = resolveMount(mountDto);

        if (mount.getId() == null){
            mountRepository.save(mount);
        }

        MountVM mountVM = new MountVM();
        mountVM.setName(mount.getName());

        return mountVM;
    }

    private Mount resolveMount(MountDTO mountDto){
        Mount mount = new Mount();
        mount.setName(mountDto.getName());
        mount.setTaming(mountDto.getTaming());
        mount.setOccurence(mountDto.getOccurence());
        mount.setOwned(mountDto.isOwned());

        return mount;
    }
}
