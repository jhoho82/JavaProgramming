package com.eomjinyoung.java.basic.step02;

//////////////////////////////////////////////////////
//주제 : 비트 연산자(Bitwise Operator)
//////////////////////////////////////////////////////
//
//만든이 :		엄진영

/* 비트 연산자(Bitwise Operator)
 * : >>, >>>, <<, &, |, ^, ~
 */

public class Operator06
{
	public static void main(String[] args) 
	{
		/* 테스트 1 : >> 
int i = 11;
int s = i >> 2;

System.out.println("i >> 2 : " + s);
		 */
		/* 해설
		 * - '>>' 연산자는 왼쪽으로 비트를 옮긴다. 빈자리는 부호비트로 채워진다.
		 * i의 2진수 표현 : 0000 0000 0000 0000 0000 0000 0000 1011
		 *           결과 : 00------------------------------00 0010(11 : 짤림)
		 */

		/* 테스트 2 : >>
int  i = -11;
int s = i >> 2;

System.out.println("i >> 2 : " + s);
		 */
		/* 해설
		 * - 결과는 음의 수가 나온다. 빈자리는 부호비트로 채워지기 때문에.
		 * i의 2진수 표현 : 1111 1111 1111 1111 1111 1111 1111 0101    (-11)
		 *           결과 : 11------------------------------11 1101(01: 짤림)
		 */		

		/* 테스트 3 : >>>
int i = 11;
int s = i >>> 2;

System.out.println("i >>> 2 : " + s);
		 */
		/* 해설
		 * - 빈자리는 0 으로 채워진다.
		 * i의 2진수 표현 : 0000 0000 0000 0000 0000 0000 0000 1011
		 *           결과 :00------------------------------00 0010(11 : 짤림)
		 */

		/* 테스트 4 : >>>
int i = -11;
int s = i >>> 2;

System.out.println("i >>> 2 : " + s);
		 */
		/* 해설
		 * i의 2진수 표현 : 1111 1111 1111 1111 1111 1111 1111 0101(-11)
		 *           결과 : 00------------------------------11 1101(01: 짤림)
		 */

		/* 테스트 5 : <<
int i = 11;
int s = i << 2;

System.out.println("i << 2 : " + s);
		 */
		/* 해설
		 * - 왼쪽으로 이동하고 오른쪽 빈자리는 0으로 채워진다.
		 * i의 2진수 표현 :   0000 0000 0000 0000 0000 0000 0000 1011
		 *			결과 : 00--------------------------------10 1100
		 */

		/* 테스트 6 : <<
int i = -11;
int s = i << 2;

System.out.println("i << 2 : " + s);
		 */
		/* 해설
		 * i의 2진수 표현 :   1111 1111 1111 1111 1111 1111 1111 0101(-11)
		 *          결과 : 11--------------------------------01 0100
		 */

		/* 테스트 7 : &
int i = 10, i2 = 11;
int s = i & i2;

System.out.println("i & i2 = " + s);
		 */
		/* 해설
		 * - bit의 논리연산을 수행한다. 두 bit 모두 1일때만 1이된다.
		 *			  0000 1010 (10)
		 *			& 0000 1011 (11)
		 *			------------------
		 *			  0000 1010 (10)
		 */

		/* 테스트 8 : ^
int i = 10, i2 = 11;
int s = i ^ i2;

System.out.println("i ^ i2 = " + s);
		 */
		/* 해설
		 * - 두 bit의 값이 같지 않을 때만 1이된다.
		 * 		  0000 1010 (10)
		 *		^ 0000 1011 (11)
		 *		------------------
		 *		  0000 0001 (1)
		 */

		/* 테스트 9 : ~
int i = 10;
int s = ~i;

System.out.println("~i = " + s);
		 */
		/* 해설
		 * - bit 값이 1인경우 0으로, 0인경우 1로 된다.
		 *	~  0000 1010
		 *  -------------
		 *     1111 0101
		 */
	}
}

