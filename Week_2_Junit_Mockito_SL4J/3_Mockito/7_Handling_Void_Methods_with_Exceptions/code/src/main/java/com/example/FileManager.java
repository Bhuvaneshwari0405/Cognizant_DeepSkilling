package com.example;

public class FileManager {
    private final FileService fileService;

    public FileManager(FileService fileService) {
        this.fileService = fileService;
    }

    public void delete(String filename) throws Exception {
        fileService.deleteFile(filename);
    }
}
