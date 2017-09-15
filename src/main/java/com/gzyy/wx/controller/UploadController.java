package com.gzyy.wx.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author @DT人 【jky1988@qq.com】
 * @Date 2017/9/14 23:42
 */
@RestController
public class UploadController {

    //获取上传的文件夹，具体路径参考application.yml中的配置
    @Value("${web.upload-path}")
    private String uploadPath;


    /**
     *GET请求
     * 上传页面，也将显示已经存在的文件
     * @return
     */
    @GetMapping(value = "wx/index")
    public List index() {
        // 获取已存在文件
        File[] files = new File(uploadPath).listFiles();
        List<String> fileNames = Stream.of(files).map(File::getName).collect(Collectors.toList());
        System.out.println("======"+ fileNames);
        return fileNames;
    }


    /**
     * 文件上传方法
     * @param file
     * @param request
     */
    @PostMapping("wx/upload")
    public void upload(@RequestParam("file")MultipartFile file, HttpServletRequest request) {
        // 可以获取传过来的参数
        System.out.println("name==========" + request.getParameter("name"));
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(),new File(uploadPath + File.separator + file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
