package com.gzyy.wx.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

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
     * @param map
     * @return
     */
    @GetMapping(value = "wx/index")
    public Map<String,Object> index(Map map) {
        // 获取已存在文件
        File[] files = new File(uploadPath).listFiles();
        System.out.println("======"+ files);
        map.put("files", files);
        return map;
    }


    /**
     * 文件上传方法
     * @param file
     * @param request
     */
    @PatchMapping("wx/upload")
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
