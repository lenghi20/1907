/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghi.util.test;

import nghi.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    @Test //ký hiệu của JUnit đưa ra, biển hàm ngay sau đây thành
          //public static void main(), app có nhiều main()
          //F6 chạy main() mặc định, shift F6 là chạy main() ở @Test
          //đây là 1 trong những cách đặt tên cho hàm test, để test code chính
    
    public void getFactorial_RunsWall_IfValidArgument(){
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(1));
    }
    //xanh chỉ đạt được khi tất cả cùng xanh
    //đỏ chỉ cần ít nhất 1 thằng đỏ
    //ý nghĩa là hàm đã đúng là phải đúng hết, sai 1 hoặc nhiều cái thì ko đáng tin
    
    
    //viết code để test code chính (MathUtility)
    //Viết code dùng thư viện JUnit, NUnit, xUnit, jasmine, ... để test
    //Xem code chính chạy ổn ko trước khi đem qua bên QC/Khách hàng trải nghiệm
    //và thư viện này cung cấp cái cơ chế báo đúng sai qua mày sắc xanh đỏ 
    //mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actual rồi kết luận
}
