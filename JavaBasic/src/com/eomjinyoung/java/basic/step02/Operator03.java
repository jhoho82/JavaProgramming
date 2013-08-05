package com.eomjinyoung.java.basic.step02;

//////////////////////////////////////////////////////
//주제 : Post-fix 연산자, Pre-fix 연산자
//////////////////////////////////////////////////////
//
//만든이 :		엄진영

/* 우리가 간혹 실수 하기 쉬운 연산자에 대해 알아보자!
 * - Post-fix 연산자 와 Pre-fix 연산자의 경우
 *   자바의 연산방법과 C++, C의 연산 방법이 틀리니.. 특히 주의해야 한다.
 */

public class Operator03
{
	public static void main(String[] args) 
	{
		/* 테스트 1 : 후위 연산자 와 전위 연산자
int a = 10;

a = a + 1;
System.out.println("a = " + a);

a++; // post-fix (후위연산자)
System.out.println("a = " + a);

++a; // pre-fix (전위연산자)
System.out.println("a = " + a);
		 */

		/* 테스트 2 : ++ 후위 연산자. 나중에 연산을 수행
int a = 10;
int s = 0;
s = a++; 

System.out.println("s = " + s + ", a = " + a);
		 */		
		/* 해설
		 * a = 10, s = 0 일때, 
		 * 1) s = a++; 에서 ++ 은 후위 연산자 이므로 먼저, a++ 자리에 a의 값이 놓이고,
		 *	  그 다음에 a++ 이 수행된다. 즉, s = 10; 인채로 있다. 아직 연산이 완료
		 *    되지 않았기 때문에 할당문은 수행되지 않음.
		 * 2) a = a + 1을 수행. (a = 11)
		 * 3) s = 10; 에서 할당문이 수행. 즉, s = 10 할당.
		 */

		/* 테스트 3 : ++ 전위 연산자. 먼저 연산을 수행
int a = 10;
int s = 0;
s = ++a;

System.out.println("s = " + s + ", a = " + a);
		 */
		/* 해설
		 * a = 10, s = 0 일때,
		 * 1) s = ++a; 에서 ++ 은 전위 연산자 이므로, a = a + 1 수행. (a = 11)
		 * 2) s = a;  수행. 즉, s = 11; 과 같다.
		 */

		/* 테스트 4 : 고민해 볼 문제? 위의 방법대로 하면 별것 아니다.
int a = 10;
a = a++;

System.out.println("a = " + a);
		 */
		/* 해설
		 * 1) a = a++; 에서 a++ 자리에 a의 값이 놓이고, 그다음 a = a + 1이 수행;
		 *	  즉, a = 10; 인 채로 있고, 아직 할당문이 수행되지 않는다.
		 * 2) a++ 실행 --> a = a + 1 -->  a = 11
		 * 3) 그리고, a = 10 을 수행.
		 */

		/* 테스트 5 : 좀더 깊이 들어가 봅시다!
int a = 10;
int s = 0;

s = a++ + a++ + a++;

System.out.println("s = " + s + ", a = " + a);
		 */
		/* 해설
		 * 1) s = 10(a = a + 1 수행) + a++ + a++;
		 * 2) s = 10 + 11 (a = a + 1 수행) + a++;
		 * 3) s = 10 + 11 + 12( a = a + 1);
		 * 4) s = 10 + 11 + 12 (마무리 수행 a = 13);
		 * 5) s = 10 + 11 + 12
		 * 6) s = 33
		 * - 결과는 s = 33, a = 13 이 된다.
		 *   한번 이것을 C++ 프로그램으로 바꾸고 컴파일 해보라!(아시는 분만..)
		 *   본인이 sun 웍스테이션에 gcc 2.95.2 버젼에서 컴파일해보니...흐~~~
		 *   s = 30, a = 11 이란 결과가 나왔다...흠..
		 *   자바는 이렇게 약간의 방식이 틀리니, 혹 다른 언어를 아시는 분은,
		 *   기존의 언어에서의 연산 방법을 잊어버리시고 차라리 백지에 새로
		 *   쓰시는게 더 낫다!
		 */

		/* 테스트 6 : Post-fix 연산자로 한번 테스트 해 봅시다!
int a = 10;
int s = 0;

s = ++a + ++a + ++a;

System.out.println("s = " + s + ", a = " + a);
		 */
		/* 해설
		 * 1) s = (a = a + 1를 먼저 수행) a + ++a + ++a;
		 * 2) s = 11 + (a = a + 1 수행) a + ++a;
		 * 3) s = 11 + 12 + (a = a + 1 수행) a;
		 * 4) s = 11 + 12 + 13;
		 * - 결과는 s = 36, a = 13이 될 것이다. 
		 *   이것 또한, C++ 또는 C 프로그래밍으로 테스트 해보라!
		 */
	}
}
