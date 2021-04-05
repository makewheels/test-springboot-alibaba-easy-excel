package com.example.testspringbootalibabaeasyexcel;

import com.alibaba.excel.EasyExcel;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Excel工具类
 */
public class ExcelUtil {
    /**
     * Excel文件下载
     *
     * @param response
     * @param fileName
     * @param clazz
     * @param data
     * @throws IOException
     */
    public static void download(
            HttpServletResponse response, String fileName,
            Class<?> clazz, List<?> data) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        try {
            fileName = URLEncoder.encode(fileName, StandardCharsets.UTF_8.name())
                    .replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setHeader("Content-disposition",
                "attachment;filename*=utf-8''" + fileName);
        EasyExcel.write(response.getOutputStream(), clazz)
                .sheet("Sheet1")
                .doWrite(data);
    }
}
