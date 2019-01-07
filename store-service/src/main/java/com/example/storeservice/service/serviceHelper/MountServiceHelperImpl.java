package com.example.storeservice.service.serviceHelper;

import com.example.storeservice.dto.MountDTO;
import com.example.storeservice.entity.Mount;
import com.example.storeservice.repository.MountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MountServiceHelperImpl implements MountServiceHelper {

    private final MountRepository mountRepository;

    @Override
    public void createAndSave(MountDTO mountDTO) {

        Mount mount = resolveMount(mountDTO);

        if (mount.getId() == null) {
            mountRepository.save(mount);
        }
    }

    private Mount resolveMount(MountDTO mountDto) {
        Mount mount = new Mount();
        mount.setName(mountDto.getName());
        mount.setTaming(mountDto.getTaming());
        mount.setOccurence(mountDto.getOccurence());
        mount.setOwned(mountDto.isOwned());

        return mount;
    }
}
