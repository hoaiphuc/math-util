/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hopu.mathutil.test.core;

import com.hopu.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author hPhuc
 */

//câu lệnh này của JUnit báo hiệu rằng sẽ cần loop qua tập data để
//lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected|Input
    @Parameterized.Parameters //JUnit sẽ ngầm chạy loop qua từng dòng của mảng
                              //để lấy ra đc cặp data input/expected
    public static Object[][] initData() {
        return new Integer[][] {
                                    {0, 1},
                                    {1, 1},
                                    {2, 2},
                                    {3, 6},
                                    {4, 24},
                                    {5, 120},
        };
    }
    
    //giả sử loop qua từng mảng, ta vẫn cần gán từng value của cột
    //vào biến tương ứng input, expected để hồi feed cho hàm 
    
    @Parameterized.Parameter(value = 0) //value=0 là map với mảng data
     public int n; //biến map với value của cột 0 của mảng
     
    @Parameterized.Parameter(value = 1)
     public long expected; //kiểu long vì giá trị trả về của hàm getF() là long
     
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
