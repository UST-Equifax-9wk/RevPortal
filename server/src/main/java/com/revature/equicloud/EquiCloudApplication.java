package com.revature.equicloud;

import com.revature.equicloud.entities.Upload;
import com.revature.equicloud.repositories.UploadRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EquiCloudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EquiCloudApplication.class, args);
//		UploadRepository uploadRepository = context.getBean(UploadRepository.class);
//		Upload upload = new Upload();
//		upload.setFileName("secondTestWithAReeeeeaaaaaaaalllllyyyyyLongName.doc");
//		upload.setPath("second fake path");
//		upload.setDescription("A file with a reeeeeeeeeeeaaaaaaaalllllyyy long name to check formatting for a lot of information in a single entry");
//		uploadRepository.save(upload);
	}

}
