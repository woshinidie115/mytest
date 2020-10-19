package com.hzb.photoalbum;

import com.hzb.photoalbum.pojo.PImage;
import com.hzb.photoalbum.repository.ImageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoalbumApplicationTests {
	@Autowired
	ImageRepository repository;
	@Test
	public void contextLoads() {
//		List<PImage> pImagesByDesc = repository.findPImagesByDesc();
//		for (PImage pimage:pImagesByDesc){
//			System.out.println(pimage.toString());
//		}
	}

}
