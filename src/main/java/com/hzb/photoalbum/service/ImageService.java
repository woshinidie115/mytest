package com.hzb.photoalbum.service;

import com.hzb.photoalbum.pojo.PImage;
import com.hzb.photoalbum.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

//    public void getImageByDesc(String desc){
//        List<PImage> pImagesByDesc = imageRepository.findPImagesByDesc();
//    }
    public void save(PImage image) {
        imageRepository.save(image);
    }

    public List<PImage> getImageByUserId(String userId) {
        return imageRepository.findPImagesByUserId(userId);
    }

    public List<Object> getIamgesByCategroy(){


        return null;

    }
    public List<PImage> getRandomImages(String userId, String model) {
        if (model.equals("SJZS")) {
            userId = "%";
        }
        List<String> list = imageRepository.getALLId(userId);
        int size = list.size();
        if (size == 0) {
            return null;
        }
        List<String> id = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * size);
            id.add(list.get(x));
        }
        return imageRepository.getRandomImages(id);
    }

    public void editDesc(String id, String desc, String name) {
        Optional<PImage> optional = imageRepository.findById(id);
        PImage pImage = optional.get();
        pImage.setImageDesc(desc);
        pImage.setImageName(name);
        imageRepository.save(pImage);
    }

    public void deleteImageById(String id) {
        imageRepository.deleteById(id);
    }

}
