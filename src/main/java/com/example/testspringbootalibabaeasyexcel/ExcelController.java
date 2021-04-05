package com.example.testspringbootalibabaeasyexcel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("excel")
public class ExcelController {
    /**
     * 文件下载
     */
    @GetMapping("download")
    public void download(HttpServletResponse response) throws IOException {
        ExcelUtil.download(response,
                "中文" + System.currentTimeMillis() + ".xlsx",
                User.class,
                DataUtil.getData());
    }

    /**
     * 文件上传
     * <p>1. 创建excel对应的实体对象
     * <p>2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器
     * <p>3. 直接读即可
     */
    @PostMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
//        EasyExcel.read(file.getInputStream(), User.class, new UploadDataListener(uploadDAO)).sheet().doRead();
        return "success";
    }
}
