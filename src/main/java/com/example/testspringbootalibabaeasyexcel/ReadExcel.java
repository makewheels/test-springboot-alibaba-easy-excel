package com.example.testspringbootalibabaeasyexcel;

import com.alibaba.excel.EasyExcel;

import java.io.File;

public class ReadExcel {
    public static void main(String[] args) {
        String path = "C:\\Users\\thedoflin\\Downloads\\新建文件夹";
        String fileName = "write_" + System.currentTimeMillis() + ".xlsx";
        File file = new File(path, fileName);
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
//        EasyExcel.read(file, User.class, new DemoDataListener()).sheet().doRead();
    }
}
