/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;
import nghi.util.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " +MathUtility.getFactorial(5));
        //          tui gọi hàm tính 51 hy vọng hàm trả về 120
        //lát hồi hàm chạy, coi thực tế là mấy - ACTUAL
        //tuiso sánh với cái tui hy vọng trước khi tính, EXPECTED 120
        //ACTUAL == EXPECTED, HÀM CHYAJ ĐÚNG CHI TÌNH HUỐNG NÀY, TEST CASE 
        System.out.println("0!=" + MathUtility.getFactorial(0));
                                    //expected: 1, actial: 7 chạy mới biết
                                    //chạy xong mới biết hàm đúng
        //cách test kiểu này gọi là: MANUAL
        //vì ta phải nhìn bằng mắt để ta luận kết quả
        System.out.println("-5!=" + MathUtility.getFactorial(-5));
    }
    
}
