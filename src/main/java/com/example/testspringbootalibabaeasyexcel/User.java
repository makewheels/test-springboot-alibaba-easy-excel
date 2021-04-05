package com.example.testspringbootalibabaeasyexcel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @ExcelProperty("字符串标题")
    @ColumnWidth(55)
    private String string;

    @ExcelProperty("日期标题")
    @ColumnWidth(20)
    private Date date;

    @ExcelProperty("数字标题")
    @ColumnWidth(13)
    private Double doubleData;
    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;
}