package com.example.testspringbootalibabaeasyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ContentRowHeight(42)
public class User {
    @ExcelProperty("字符串标题")
    @ColumnWidth(20)
    private String string;

    @ExcelProperty("日期标题")
    @ColumnWidth(20)
    private Date date;

    @ExcelProperty("数字标题")
    @ColumnWidth(13)
    private Double doubleData;

    @ExcelProperty("图片")
    @ColumnWidth(8)
    private File image;

}