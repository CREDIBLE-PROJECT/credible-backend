package com.example.creadible.AWS.service;

import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {
    String uploadFile(MultipartFile multipartFile, String dirName);
}