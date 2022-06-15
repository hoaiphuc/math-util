/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hopu.mathutil.core;

/**
 *
 * @author hPhuc
 */
public class MathUtil {
    //Trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    // hàm thư viện xài chung cho ai đó mà kh cần lưu lại giá trị
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa
    //n! = 1.2.3.4...n
    //kh có giai thừa cho số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vùa kịp đủ cho kiểu long của java
    //bài này quy ước tính n! trong khoảng 0-20
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("invalid agrument. N must be between 0-20");
//        if (n == 0 || n == 1)
//            return 1; //kết thúc sớm nếu nhận đầu vào đặc biệt
//        long product = 1; //tich nhan don
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        
//        return product;
//    }
    
    public static long getFactorial(int n) {
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("invalid agrument. N must be between 0-20");
        
        if (n == 0 || n == 1)
            return 1; //kết thúc sớm nếu nhận đầu vào đặc biệt

        
        return n * getFactorial(n - 1);
    }
    
    //đệ quy: gọi lại chính mình với 1 quy mô khác
}
