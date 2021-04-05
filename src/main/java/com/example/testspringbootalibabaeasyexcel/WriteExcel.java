package com.example.testspringbootalibabaeasyexcel;

import com.alibaba.excel.EasyExcel;

import java.io.File;

public class WriteExcel {
    public static void main(String[] args) {
        String path = "C:\\Users\\thedoflin\\Downloads\\新建文件夹";
        String fileName = "write_" + System.currentTimeMillis() + ".xlsx";
        File file = new File(path, fileName);
        EasyExcel.write(file, User.class).sheet("Sheet1").doWrite(DataUtil.getData());
    }
}
