package KakaoPaytest;

import java.util.Random;

public class CreateCoupon {
	
	public String getCouponNum() {
		int couponSize = 1;
		String couponNum = "";

		final char[] possibleCharacters =

				{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 'B', 'C', 'D', 'E', 'F',

						'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',

						'V', 'W', 'X', 'Y', 'Z'};

		final int possibleCharacterCount = possibleCharacters.length;

		String[] arr = new String[couponSize];

		Random rnd = new Random();

		int currentIndex = 0;

		int i = 0;

		while (currentIndex < couponSize) {

			StringBuffer buf = new StringBuffer(18);

			for (i= 18; i > 0; i--) {
				buf.append(possibleCharacters[rnd.nextInt(possibleCharacterCount)]);

			}

			couponNum = buf.toString();

			System.out.println(couponNum);
			//System.out.println("쿠폰번호 생성 ::  " + password.substring(0, 4) + "-" + password.substring(5,11) + "-" + password.substring(12, 20));

			arr[currentIndex] = couponNum;

			currentIndex++;

		}
		
		return couponNum;

	}

}
