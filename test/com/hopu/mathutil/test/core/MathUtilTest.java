/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hopu.mathutil.test.core;

import com.hopu.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

/**
 *
 * @author hPhuc
 */
public class MathUtilTest {
    //đây là class sẽ sử dụng frameworj JUnit để kiểm tra code chính
    // gnaf tinhgiathua() bên class core.MtthUtil

    //Có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ nói lên mục đích của các case/tinh huoogs kiểm tử
    //tình huống xà hàm theo kiểu thành con thay thất bại
    //@TestJUnit sẽ phối hợp với JVM để chạy hàm
    //@Test phía hậu trường chính là public void main()
    //có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
        int n = 0; //test thử tính huống tử tế đầu vào, mày phải chạy đúng
        long expected = 1;
        //long actual = ; //gọi hàm cần test bên core/app chính
        long actual = MathUtil.getFactorial(n);

        //so sánh expected vs. actual dùng framework
        assertEquals(expected, actual);
        //hàm giúp so sánh 2 giá trị có giống nhau kh, nếu có thả màu xanh
        //ít nhất cho case dang test
        //nếu kh giống nhau -> thảy màu đỏ

        //gộp thêm vài case thành công đừa vào đầu ngon
        assertEquals(1, MathUtil.getFactorial(1)); //tui muốn 1! == 1
        assertEquals(2, MathUtil.getFactorial(2));
        assertEquals(6, MathUtil.getFactorial(3));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(120, MathUtil.getFactorial(5));
        assertEquals(720, MathUtil.getFactorial(6));

    }

    //hàm getF() ta thiết kế 2 tình huống xử lí
    //1. đưa data tử tế từ [0..20] -> tính đc n! - done
    //2. đưa data vào cà chớn, âm, > 20; thiết kế của hàm là ném ra ngoại lệ
    //t kì vọng ngoại lệ xuất hiện khi n < 0 || n > 20 
    //rất mong ngoại lệ xuất hiện
    //có ngoại lệ -> màu xanh
    //input: -5
    //expected: IllegalArgumentException xuất hiện
    //assertEquals() kh dùng để so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay kh trên value!!!
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); //hàm test hay hàm getF() sẽ ném về NUmber...
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); //hàm test chạy, hay hàm getF() chạy
    }

    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn
    //xài lambda
    //test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi chơi với 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
//        Assert.assertThrows(tham số 1: loại ngoai  lệ muốn so sánh, 
//                            tham số 2: đoạn code chạy văng ra ngoại runnable);
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        //chủ đọng kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt trycatch là JUnit sẽ ra màu xanh do đã chủ đọng kiểm soát ngoại lệ
            //nhưng kh chắc ngoại lệ mình cần có xuát hiện hay kh
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            Assert.assertEquals("invalid agrument. N must be between 0-20", 
                                e.getMessage());
        }
        
    }
}
