/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hopu.mathutil.main;

import com.hopu.mathutil.core.MathUtil;

/**
 *
 * @author hPhuc
 */
public class Main {
    public static void main(String[] args) {
        
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay kh
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính đc kh
        //TEST CASE: giả lập hành vi sai của ai đó
        
        //TEST CASE: là 1 tình huống sử dụng, xài app (HÀM)mà nó bao hàm
        //DATA đầu vào cụ thể nào đó
        //OUTPUT đầu ra ứng với xử lí hàm/chức năng của app, dĩ nhiên dùng đầu vào
        //vào để xử lí
        //KÌ VỌNG: Mong hàm trả về value nào đó ứng với input ở trên
        //So sánh để xem kết quả có như kì vọng hay kh
        
        long expected = 120; //kì vọng hàm trả về 120 nếu tính 5!
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
